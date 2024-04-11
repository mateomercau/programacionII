import javax.swing.*;

public class CheckingAccount extends Account {
    private float overdraft;

    public CheckingAccount(float balance, float annualInterestRate) {
        super(balance, annualInterestRate);
    }

    @Override
    public void withdraw(float amount) {
        if (amount <= balance + overdraft) {
            if (amount <= balance) {
                super.withdraw(amount);
            } else {
                overdraft += balance - amount;
                balance = 0;
                numWithdrawals++;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay suficiente saldo y sobregiro para realizar el retiro.");
        }
    }

    @Override
    public void deposit(float amount) {
        if (overdraft > 0) {
            if (amount <= overdraft) {
                overdraft -= amount;
            } else {
                balance += amount - overdraft;
                overdraft = 0;
            }
        } else {
            super.deposit(amount);
        }
    }

    @Override
    public void monthlyStatement() {
        super.monthlyStatement();
        JOptionPane.showMessageDialog(null, "Sobregiro: " + overdraft);
    }
}


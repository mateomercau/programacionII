import javax.swing.JOptionPane;
class SavingsAccount extends Account {
    private boolean active;

    public SavingsAccount(float balance, float annualInterestRate) {
        super(balance, annualInterestRate);
        active = balance >= 10000;
    }

    @Override
    public void deposit(float amount) {
        if (active) {
            super.deposit(amount);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede consignar en una cuenta inactiva.");
        }
    }

    @Override
    public void withdraw(float amount) {
        if (active) {
            if (amount <= balance) {
                super.withdraw(amount);
            } else {
                JOptionPane.showMessageDialog(null, "No hay suficiente saldo para realizar el retiro.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se puede retirar de una cuenta inactiva.");
        }
    }

    @Override
    public void monthlyStatement() {
        if (numWithdrawals > 4) {
            monthlyFee += (numWithdrawals - 4) * 1000;
        }
        active = balance >= 10000;
        super.monthlyStatement();
    }
}
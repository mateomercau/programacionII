import javax.swing.JOptionPane;

class Account {
    protected float balance;
    protected int numDeposits;
    protected int numWithdrawals;
    protected float annualInterestRate;
    protected float monthlyFee;

    public Account(float balance, float annualInterestRate) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void deposit(float amount) {
        balance += amount;
        numDeposits++;
    }

    public void withdraw(float amount) {
        if (amount <= balance) {
            balance -= amount;
            numWithdrawals++;
        } else {
            JOptionPane.showMessageDialog(null, "No hay suficiente saldo para realizar el retiro.");
        }
    }

    public void calculateMonthlyInterest() {
        float monthlyInterest = (balance * annualInterestRate) / 12;
        balance += monthlyInterest;
    }

    public void monthlyStatement() {
        balance -= monthlyFee;
        calculateMonthlyInterest();
    }

    public void printStatement() {
        JOptionPane.showMessageDialog(null, "Saldo: " + balance +
                "\nComisión mensual: " + monthlyFee +
                "\nNúmero de transacciones realizadas: " + (numDeposits + numWithdrawals));
    }
}
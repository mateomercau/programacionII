import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        float initialBalance = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el saldo inicial:"));
        float annualInterestRate = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la tasa de interés anual (%):"));

        // Create a savings account
        SavingsAccount savingsAccount = new SavingsAccount(initialBalance, annualInterestRate);

        // Create a checking account
        CheckingAccount checkingAccount = new CheckingAccount(initialBalance, annualInterestRate);

        while (true) {
            String[] options = {"Cuenta de Ahorros", "Cuenta Corriente", "Salir"};
            int choice = JOptionPane.showOptionDialog(null, "Seleccione una cuenta:", "Gestión de Cuentas",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    handleAccountOperations(savingsAccount);
                    break;
                case 1:
                    handleAccountOperations(checkingAccount);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Programa terminado.");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
                    break;
            }
        }
    }

    private static void handleAccountOperations(Account account) {
        while (true) {
            String[] options = {"Depositar", "Retirar", "Mostrar Operaciones", "Volver"};
            int choice = JOptionPane.showOptionDialog(null, "Seleccione una operación:", "Operaciones de Cuenta",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    float depositAmount = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a consignar:"));
                    account.deposit(depositAmount);
                    break;
                case 1:
                    float withdrawAmount = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a retirar:"));
                    account.withdraw(withdrawAmount);
                    break;
                case 2:
                    account.printStatement();
                    break;
                case 3:
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
                    break;
            }
        }
    }
}
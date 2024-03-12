import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize bank account with initial balance
        BankAccount bankAccount = new BankAccount(1000.0);

        // Create an ATM instance
        ATM atm = new ATM(bankAccount);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            atm.displayMenu();
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            atm.processOption(option);
        }
    }
}

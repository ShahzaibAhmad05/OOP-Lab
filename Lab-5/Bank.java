import java.util.Scanner;
import java.util.UUID; // For generating unique account numbers

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an account
        System.out.println("Enter Account Holder's Name:");
        String accountHolderName = scanner.nextLine();
        
        System.out.println("Enter Initial Deposit Amount:");
        double initialDeposit = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        
        System.out.println("Enter Account Type (e.g., Savings, Current):");
        String accountType = scanner.nextLine();
        
        // Create the bank account
        BankAccount account = new BankAccount(accountHolderName, initialDeposit, accountType);
        
        // Display account details
        account.displayAccountDetails();

        // Perform transactions (deposit, withdraw)
        while (true) {
            System.out.println("\nBank Account Management Menu:");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Display Account Details");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                    
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                    
                case 3:
                    account.displayAccountDetails();
                    break;
                    
                case 4:
                    System.out.println("Exiting system. Goodbye!");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}

class BankAccount {
    // Attributes
    private final String accountNumber;
    private final String accountHolderName;
    private double balance;
    private final String accountType;

    // Constructor to create a new bank account
    public BankAccount(String accountHolderName, double initialBalance, String accountType) {
        this.accountNumber = generateAccountNumber(); // Generates a unique account number
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.accountType = accountType;
    }

    // Method to generate a unique account number (UUID)
    private String generateAccountNumber() {
        return UUID.randomUUID().toString(); // Generates a random unique account number
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal denied.");
        } else {
            System.out.println("Withdrawal amount must be greater than zero.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("\nAccount Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: $" + balance);
    }

    // Getter methods for each attribute (optional, for validation or accessing info)
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }
}

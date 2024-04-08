import java.util.*;

// Custom class representing a bank account
class BankAccount {
    private String accountNum;
    private String accountType;
    private String name;
    private double balance;

    public BankAccount(String accountNum, String accountType, String name, double balance) {
        this.accountNum = accountNum;
        this.accountType = accountType;
        this.name = name;
        this.balance = balance;
    }

    // Getters and setters
    // ...

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Dear " + name + ", Your money has been successfully deposited.\nYour current balance is: " + balance);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Dear " + name + ", Please collect the amount.");
        } else {
            System.out.println("Dear " + name + ", Insufficient Balance");
        }
    }

    // Other methods as needed
    // ...
}

public class MainPage {
    private static Map<String, BankAccount> accounts = new HashMap<>();

    // Method to open a new bank account
    static void openAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account number: ");
        String accountNum = sc.nextLine();
        System.out.print("Enter Account type: ");
        String accountType = sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();
        
        BankAccount account = new BankAccount(accountNum, accountType, name, balance);
        accounts.put(accountNum, account);

        System.out.println("Details saved.");
    }

    // Method to log in to an existing bank account
    static void login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account number: ");
        String accountNum = sc.nextLine();

        BankAccount account = accounts.get(accountNum);
        if (account != null) {
            System.out.println("Login Successful!");
            // Perform banking operations
            // Example: account.deposit(100);
            //           account.withdraw(50);
        } else {
            System.out.println("Account not found. Please try again.");
        }
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Greetings from SBI");
        System.out.println("1. ARE YOU NEW HERE?\n2. EXISTING CUSTOMER?");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input) {
            case 1:
                openAccount();
                break;
            case 2:
                login();
                break;
            default:
                System.out.println("Invalid option.");
        }
    }
}

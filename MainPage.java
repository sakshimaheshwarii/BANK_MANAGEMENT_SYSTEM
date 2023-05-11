import java.util.*;

public class MainPage {
    static void AccountHistory() {
        deposits();
    }

    static void moneyTransfer(){
        withdraw();
        deposits();
    }

    static void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number: ");
        String account_num=sc.nextLine();
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter amount to be withdrawn: ");
        int debited = sc2.nextInt();
        int balance = 9876543;
        if (debited <= balance) {
            balance -= debited;
            System.out.println("dear"+ account_num+", Please collect the amount.");
        } else {
            System.out.println("Insufficient Balance");
        }
        System.out.println();
    }

    static void deposits() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number: ");
        String account_num=sc.nextLine();
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        int deposit = sc2.nextInt();
        int balance = 0;
        balance += deposit;
        System.out.println("dear"+ account_num+ ", Your money has been successfully deposited.\nYour current balance is:" + balance);
        System.out.println();
    }

    static void loan() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Loan Application");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.println();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.println();

        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.println();

        System.out.print("Loan Amount: ");
        double loanAmount = scanner.nextDouble();
        System.out.println();

        System.out.print("Interest Rate: ");
        double interestRate = scanner.nextDouble();
        System.out.println();

        System.out.print("Tenure (in months): ");
        int tenure = scanner.nextInt();

        int BankBalance = 9876543;

        if (BankBalance > loanAmount) {
            System.out.println("Loan successfully provided.\n Thank You!");
            if (loanAmount <= 10000)
                interestRate = 5;
            else if (loanAmount > 10000 && loanAmount <= 25000)
                interestRate = 5.5;
            else if (loanAmount > 25000 && loanAmount <= 50000)
                interestRate = 6.4;
            else if (loanAmount > 50000 && loanAmount <= 100000)
                interestRate = 6.9;
            else if (loanAmount > 100000 && loanAmount <= 250000)
                interestRate = 7.3;
            else if (loanAmount > 250000 && loanAmount <= 600000)
                interestRate = 8.5;
            else if (loanAmount > 600000 && loanAmount <= 1000000)
                interestRate = 9.3;
            else
                interestRate = 11.2;
            int amount = (int) (loanAmount * (interestRate / 100) * (tenure / 12));
            System.out.println("You'll have to pay " + amount + " interest at the end of tenure");
            BankBalance -= loanAmount;
        } else {
            System.out.println("Insufficient Balance.\n Try Later, Thank You!");
        }

    }

    static void balanceEnquiry() {
        System.out.println("---------BALANCE ENQUIRY---------");
        System.out.println("How do you want to check your balance?");
        System.out.println(
                "1. SBI Missed Call Number\n 2. SBI Net Banking\n 3. Visit SBI\n 4. USSD Code\n 5.SBI SMS Banking\n 6.SBI Mobile Banking\n 7.UPI App\n 8. Call CustomerCare");
        Scanner sc = new Scanner(System.in);
       int input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.println("Call 09223766666");
                break;
            case 2:
                System.out.println("Visit www.onlinesbi.com");
                break;
            case 3:
                System.out.println("ATM");
                int balance = 10000;
                System.out.println("Let's proceed with the balance enquiry: ");
                System.out.println("Balance:" + balance);
                System.out.println();
                break;
            case 4:
                System.out.println("Dial *99*41#");
                break;
            case 5:
                System.out.println("send 'BAL' to 09223766666");
                break;
            case 6:
                System.out.println("SBI YONO, SBI Online, SBI Quick, SBI Saral");
                break;
            case 7:
                System.out.println("BHIM SBI Pay");
                break;
            case 8:
                System.out.println("Toll Free 1800112211 or 18004253800");
                break;

        }

    }

    static void login() {
        String savedUsername = "hello java";
        String savedPassword = "password";
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Login Page");
        System.out.println("(username and password are case sensitive)");

        System.out.print("Username: ");
        String username = sc.nextLine();
        System.out.println();

        System.out.print("Password: ");
        String password = sc.nextLine();
        System.out.println();

        if (username.equals(savedUsername) && password.equals(savedPassword))
        {
            System.out.println("Login Successful!");
            System.out.println("how may we help you?\n you want to know,\n 1. Balance enquiry,\n 2. withdraw an amount,\n 3. deposit an amounts,\n 4.Account History,\n 5. Loan for an amount,\n 6. Money Transfer");
            int num=sc.nextInt();
            switch(num)
            {
                case 1: balanceEnquiry();break;
                case 2: withdraw(); break;
                case 3: deposits(); break;
                case 4: AccountHistory(); break;
                case 5: loan(); break;
                case 6: moneyTransfer();break;
            }
        }
        else
        { 
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    static void OpenAccount() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account number: ");
        String accountNum = sc.nextLine();
        System.out.println();

        System.out.print("Enter Account type: ");
        String accountType = sc.nextLine();
        System.out.println();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.println();

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();
        System.out.println("details saved.");
    }

    public static void main(String[] args) {
        System.out.println("Greetings from SBI");
        System.out.println("1. ARE YOU NEW HERE?\n2. EXISTING CUSTOMER?");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input) {
            case 1:
                OpenAccount();
                break;
            case 2:
                login();
                break;
        }
    }
}

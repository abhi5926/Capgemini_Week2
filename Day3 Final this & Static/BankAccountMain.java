import java.util.Scanner;

class BankAccount {
    // Attributes
	static String bankName;
     String accountHolderName;
   final  String accountNumber;
    double balance;
	int count;

    // Constructor to initialize the bank account
    public BankAccount(String accountHolderName, String accountNumber, double initialBalance,String bankName) {
		count++;
		this.bankName = bankName;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
      //Get total account fuction to get total number of Account
	  public void getTotalAccounts(){
		  System.out.println("Total number of Account is :" +count);
	  }
    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Amount to deposit should be positive.");
        }
    }

    // Method to withdraw money (only if sufficient balance exists)
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }

    // Getters for account information
    public String getAccountHolder() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Sample account details
        System.out.println("Enter account holder name: ");
        String accountHolderName = scanner.nextLine();
        System.out.println("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.println("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
		System.out.println("Enter the bank name : ");
        String bankName = scanner.nextLine();

        // Create a new BankAccount object
        BankAccount account = new BankAccount(accountHolderName, accountNumber, initialBalance,bankName);

        int option;
     //Check if an account is an instanceof BankAccount class
	 if(account instanceof BankAccount){
		 System.out.println("The object account is the instance of class :");
	 }else{
		 System.out.println("The object account is not the instance of the class :");
	 }
        // Display ATM options
        System.out.println("\nATM Menu:");
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Check Balance");
        System.out.println("4. Get the Total Number of Accounts :");
		System.out.println("5. Exit :");
        System.out.print("Choose an option: ");
        option = scanner.nextInt();

        switch (option) {
            case 1:
                // Deposit money
                System.out.print("Enter amount to deposit: ");
                double depositAmount = scanner.nextDouble();
                account.deposit(depositAmount);
                break;

            case 2:
                // Withdraw money
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = scanner.nextDouble();
                account.withdraw(withdrawAmount);
                break;

            case 3:
                // Display balance
                account.displayBalance();
                break;
            case 4:
                // Display balance
                account.getTotalAccounts() ;
                break;
				
            case 5:
                // Exit the ATM
                System.out.println("Thank you for using the ATM. Goodbye!");
                break;

            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }


        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
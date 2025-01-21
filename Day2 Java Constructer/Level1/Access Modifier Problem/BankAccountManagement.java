// Base class BankAccount
class BankAccount {
    // Instance variables with different access modifiers
    public String accountNumber;  
    protected String accountHolder;  
    private double balance;  

    // Constructor to initialize BankAccount details
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Public method to modify the balance 
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Public method to withdraw from the balance 
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // Public method to get the balance (getter)
    public double getBalance() {
        return balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass SavingsAccount that inherits from BankAccount
class SavingsAccount extends BankAccount {

    // Constructor for SavingsAccount, calling the superclass constructor
    public SavingsAccount(String accountNumber, String accountHolder, double initialBalance) {
        super(accountNumber, accountHolder, initialBalance);  // Call to superclass constructor
    }

    // Method to display SavingsAccount details, demonstrating access to protected and public members
    public void displaySavingsAccountDetails() {
        // Accessing public member 'accountNumber' and protected member 'accountHolder'
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber);  
        System.out.println("Account Holder: " + accountHolder);  
        System.out.println("Balance: $" + getBalance()); 
    }
}

// Main class to test the functionality
public class BankAccountManagement {
    public static void main(String[] args) {
        // Create BankAccount instance
        BankAccount account = new BankAccount("123456789", "Abhishek", 1000.0);
        account.displayAccountDetails();

        // Create SavingsAccount instance
        SavingsAccount savingsAccount = new SavingsAccount("987654321", "Neeraj", 5000.0);
        savingsAccount.displaySavingsAccountDetails();

        // Modify balance using public methods
        account.deposit(500.0);  
        account.withdraw(200.0);  

        // Display updated balance for BankAccount
        System.out.println("\nUpdated BankAccount Details:");
        account.displayAccountDetails();
    }
}

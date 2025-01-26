package bankingsystem;

// Creating class
abstract class BankAccount {
    //Attrinutes
    private String accountNumber;
    private String holderName;
    private double balance;

    // Creating  Constructer
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    // Creating Method to Deposit amount
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println(amount +" Your Amount Deposited Successfylly :");
        }else{
            System.out.println("Please Enter Positive Amount :");
        }
    }
    // Creating Method for withdraw
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println(amount +"Withdraw Success Fully :");
        }else{
            System.out.println("Insufficient Amount :");
        }
    }
    // Creating Abstract Method
    public abstract double calculateInterest();

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + holderName);
        System.out.println("Balance: " + balance);
    }

    // Getter and Setter for encapsulation
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
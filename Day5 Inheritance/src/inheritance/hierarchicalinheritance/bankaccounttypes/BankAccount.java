package inheritance.hierarchicalinheritance.bankaccounttypes;


// Creating class name as Bank Account
public class BankAccount {
    //Attributes
    String accountNumber;
    double balance;

    // Creating Constructor
    public BankAccount(String accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    // Method to display Account Type
    public void displayAccountType()
    {
        System.out.println("This is generic Account Type :");
        System.out.println("Account number is :"+accountNumber);
        System.out.println("The balance of Account :"+balance);
    }
    // Method to retuen Account Number
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
}


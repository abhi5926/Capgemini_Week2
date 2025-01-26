package inheritance.hierarchicalinheritance.bankaccounttypes;


// Creating class name as CheckingAccount
public class CheckingAccount extends BankAccount{
    // Attributes
    double withdrawalLimit;

    // Constructor Creating
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit){
        super(accountNumber,balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    //Method to display Account Type
    public void displayAccountType(){
        System.out.println("The Account Type is Checking Account :");
        System.out.println("The Account Number is :"+accountNumber);
        System.out.println("The balance of the Account is :"+balance);
        System.out.println("The Withdrawl Limit of the Account is :"+withdrawalLimit);
    }
}


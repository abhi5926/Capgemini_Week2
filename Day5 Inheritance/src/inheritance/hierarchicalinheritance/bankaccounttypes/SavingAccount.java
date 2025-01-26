package inheritance.hierarchicalinheritance.bankaccounttypes;


// Creating class Name as Saving Account
public class SavingAccount extends BankAccount{
    // Attributes
    double interestRate;

    // Creating Constructor
    public SavingAccount(String accountNumber,double balance,double interestRate){
        super(accountNumber,balance);
        this.interestRate = interestRate ;
    }

    // Creating Method to display Account Type
    public void displayAccountType(){
        System.out.println("The Account Type is Saving Account :");
        System.out.println("The Account Number is :"+accountNumber);
        System.out.println("The balance of the Account is :"+balance);
        System.out.println("The Interest rate of the Account is :"+interestRate);
    }
}


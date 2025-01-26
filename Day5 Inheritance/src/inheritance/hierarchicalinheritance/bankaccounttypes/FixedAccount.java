package inheritance.hierarchicalinheritance.bankaccounttypes;


// Creating class Name as FixedAccount
public class FixedAccount extends BankAccount {
    // Attributes
    int tenure;

    // Constructer
    public FixedAccount(String accountNumber, double balance, int tenure){
        super(accountNumber,balance);
        this.tenure = tenure;
    }
    // Creating Method to diaplay Account Type
    public void displayAccountType(){
        System.out.println("The Account Type is Fixed Deposit Account :");
        System.out.println("The Account Number is :"+accountNumber);
        System.out.println("The balance of the Account is :"+balance);
        System.out.println("The tenure of the Account is "+tenure);
    }
}


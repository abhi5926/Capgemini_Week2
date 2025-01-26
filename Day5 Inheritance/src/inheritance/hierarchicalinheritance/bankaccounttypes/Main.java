package inheritance.hierarchicalinheritance.bankaccounttypes;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Creating Object of the class
        SavingAccount ob = new SavingAccount("123BA23",10000,4);

        CheckingAccount ob1 = new CheckingAccount("CA123",5000,15000);

        FixedAccount ob2 = new FixedAccount("GA245",6000,5);

        // Display Method Calling
        ob.displayAccountType();
        ob1.displayAccountType();
        ob2.displayAccountType();
    }
}

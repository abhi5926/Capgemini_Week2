package bankingsystem;

class BaknkingSystem {
    // Main Method
    public static void main(String[] args){
        // Creating objects
        BankAccount ob = new SavingsAccount("S123", "Abhishek", 5000);
        ob.displayAccountDetails();
        ob.deposit(1000);
        ob.withdraw(500);

        // Checking loan Eligibility
        LoanAccount ob1 = new LoanAccount();
        ob1.applyForLoan(50000);
        System.out.println("Loan Eligibility: " + ob1.calculateLoanEligibility());
    }
}

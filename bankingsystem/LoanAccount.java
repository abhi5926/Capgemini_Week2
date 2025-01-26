package bankingsystem;

//Creating class
class LoanAccount implements Loanable {
    //Attribute
    private double loanAmount;

    // Creating Method
    public void applyForLoan(double amount) {
        if (amount > 0) {
            loanAmount = amount;
            System.out.println("Loan of " + amount + " applied successfully.");
        } else {
            System.out.println("Loan amount must be positive.");
        }
    }

    public double calculateLoanEligibility() {
        return loanAmount * 0.8; // Loan eligibility is 80% of the applied amount
    }
}

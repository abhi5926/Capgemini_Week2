package bankingsystem;

// creating class
class SavingsAccount extends BankAccount {
    //Attribute
    private static final double INTEREST_RATE = 0.04;

    // Creating Constructor
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }
}

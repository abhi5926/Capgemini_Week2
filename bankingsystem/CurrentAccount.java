package bankingsystem;

// Creating class
class CurrentAccount extends BankAccount {
    //Creating Attribute
    private static final double INTEREST_RATE = 0.02;

    // Creating Constructer
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }
}

package vehiclerentalsystem;

// Subclass Bike
class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    // Constructor
    public Bike(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days; // Simple rental cost calculation
    }

    @Override
    public double calculateInsurance() {
        return 0.01 * getRentalRate(); // Insurance is 1% of rental rate for bikes
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("The Insurance Policy Number for Bike: " + insurancePolicyNumber);
    }
}

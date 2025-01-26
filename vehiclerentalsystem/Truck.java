package vehiclerentalsystem;

// Subclass Truck
class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    // Constructor
    public Truck(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days; // Simple rental cost calculation
    }

    @Override
    public double calculateInsurance() {
        return 0.03 * getRentalRate(); // Insurance is 3% of rental rate for trucks
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("The Insurance Policy Number for Truck: " + insurancePolicyNumber);
    }
}

package vehiclerentalsystem;

// Subclass Car
class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    // Constructor
    public Car(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 0.02 * getRentalRate(); // Insurance is 2% of rental rate for cars
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("The Insurance Policy Number for Car: " + insurancePolicyNumber);
    }
}


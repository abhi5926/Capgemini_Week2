package vehiclerentalsystem;

// Creating abstract class
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Constructor
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Abstract method to calculate rental cost
    public abstract double calculateRentalCost(int days);

    // Getter methods for encapsulation
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    // Method to display vehicle details
    public void display() {
        System.out.println("The Number of the Vehicle: " + vehicleNumber);
        System.out.println("The Type of the Vehicle: " + type);
        System.out.println("The Rental Rate of the Vehicle: " + rentalRate);
    }
}
// Vehicle class
public class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Class variable (shared among all vehicles)
    private static double registrationFee = 100.0; // Default registration fee

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class method to update the registration fee for all vehicles
    public static void updateRegistrationFee(double newRegistrationFee) {
        registrationFee = newRegistrationFee;
        System.out.println("Updated Registration Fee: $" + registrationFee);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Create vehicle instances
        Vehicle vehicle1 = new Vehicle("Abhishek", "Car");
        Vehicle vehicle2 = new Vehicle("Deepak", "Motorcycle");
        Vehicle vehicle3 = new Vehicle("Sachin", "Truck");

        // Display details for each vehicle
        System.out.println("Vehicle 1 Details:");
        vehicle1.displayVehicleDetails();
        System.out.println("\nVehicle 2 Details:");
        vehicle2.displayVehicleDetails();
        System.out.println("\nVehicle 3 Details:");
        vehicle3.displayVehicleDetails();

        // Updating the registration fee for all vehicles
        Vehicle.updateRegistrationFee(150.0); // Correct usage of static method

        // Display details again to show the updated registration fee
        System.out.println("\nUpdated Vehicle Details:");
        System.out.println("\nVehicle 1 Details:");
        vehicle1.displayVehicleDetails();
        System.out.println("\nVehicle 2 Details:");
        vehicle2.displayVehicleDetails();
        System.out.println("\nVehicle 3 Details:");
        vehicle3.displayVehicleDetails();
    }
}

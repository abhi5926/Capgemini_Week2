package vehiclerentalsystem;

// Main class to run the Vehicle Rental System
public class VehicleRentalSystem {
    public static void main(String[] args) {
        // Create objects for different types of vehicles
        Vehicle car = new Car("A123", "Car", 100, "C-101");
        Vehicle bike = new Bike("B456", "Bike", 30, "B-202");
        Vehicle truck = new Truck("T789", "Truck", 200, "T-303");

        // Display details for each vehicle
        car.display();
        bike.display();
        truck.display();
    }
}


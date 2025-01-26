package ridehailingapplication;

// Creating Main Class
public class RideHailingApplication {
    // Creating Main Method
    public static void main(String[] args){
        // Creating objects
        Vehicle car = new Car("C001", "ABhishek", 15, "Downtown");
        Vehicle bike = new Bike("B001", "Neeraj", 10, "Uptown");
        Vehicle auto = new Auto("A001", "Rajan", 12, "Midtown");

        // Display vehicle details
        car.getVehicleDetails();
        bike.getVehicleDetails();
        auto.getVehicleDetails();
    }
}

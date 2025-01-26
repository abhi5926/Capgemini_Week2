package inheritance.assitedproblem.vehicletransportsystem;

// Creating class to create object
class VehicleMain {
    // Main Method
    public static void main(String[] args){
        // Create object of Vehicle class
        Vehicle vehicle = new Vehicle(250,"Petrol & Diesel");
        // Call Display Method to Display Details
        vehicle.displayInfo();


        // Create object of Car class
        Car car = new Car(140,"Petrol");
        // Method to get Team size
        car.getDetail(5);
        // Call Display Method to Display Details
        car.displayInfo();

        // Create object of Truck class
        Truck truck = new Truck(70,"Diesel");
        // Method to assign Programming Language
        truck.getDetail(3);
        // Call Display Method to Display Details
        truck.displayInfo();

        // Create object of Motorcuycle  class
        Motorcycle mo = new Motorcycle(150,"Petrol");
        // Method to assign Programming Language
        mo.getDetail(3);
        // Call Display Method to Display Details
        mo.displayInfo();
    }
}


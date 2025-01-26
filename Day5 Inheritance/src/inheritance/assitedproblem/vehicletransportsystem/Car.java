package inheritance.assitedproblem.vehicletransportsystem;

// Creating class Car
class Car extends Vehicle {
    // Attributes
    int seatCarCapacity;

    // Constructor
    public Car(int maxSpeed, String fuelType){
        super(maxSpeed,fuelType);
    }

    // Method
    public void getDetail(int seatCarCapacity){
        this.seatCarCapacity = seatCarCapacity;
    }

    // Mehod to display details
    @Override
    public void displayInfo(){
        System.out.println("The Max Speed of the Car :"+maxSpeed);
        System.out.println("The Fuel Type of the Car "+fuelType);
        System.out.println("The Seat Capacity of the car"+ seatCarCapacity);
    }
}

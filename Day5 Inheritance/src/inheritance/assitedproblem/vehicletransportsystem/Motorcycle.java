package inheritance.assitedproblem.vehicletransportsystem;

// Creating class Motorcycle
class Motorcycle extends Vehicle {
    //Attribute
    int seatMotorcycleCapacity;

    // Parameterized Constructer
    public Motorcycle(int maxSpeed, String fuelType){
        super(maxSpeed,fuelType);
    }

    // Method
    public void getDetail(int seatMCapacity){
        this.seatMotorcycleCapacity = seatMCapacity;
    }
    // Mehod to display details
    @Override
    public void displayInfo(){
        System.out.println("The Max Speed of the Bike :"+maxSpeed);
        System.out.println("The Fuel Type of the Bike :"+fuelType);
        System.out.println("The Seat Capacity of the Bike :"+ seatMotorcycleCapacity);
    }
}

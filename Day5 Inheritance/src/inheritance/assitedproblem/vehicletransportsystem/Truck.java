package inheritance.assitedproblem.vehicletransportsystem;

// creating class Developer
class Truck extends Vehicle {
    //Attribute
    int  seatTruckCapacity;

    // Parameterized Constructer
    public Truck(int maxSpeed, String fuelType){
        super(maxSpeed,fuelType);


    }
    // Method
    public void getDetail(int seatTCapacity){
        this.seatTruckCapacity = seatTCapacity;
    }


    // Mehod to display details
    @Override
    public void displayInfo(){
        System.out.println("The Max Speed of the Truck :"+maxSpeed);
        System.out.println("The Fuel Type of the Truck :"+fuelType);
        System.out.println("The Seat Capacity of the truck :"+ seatTruckCapacity);
    }
}

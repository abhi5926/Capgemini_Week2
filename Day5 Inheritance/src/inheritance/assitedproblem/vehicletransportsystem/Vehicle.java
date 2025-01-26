package inheritance.assitedproblem.vehicletransportsystem;


// Creating class as Vehicle super class
class Vehicle {
    // Creating Attributes
    int maxSpeed;
    String fuelType;


    //Constructor Parameterized
    public Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;

    }

    // Mehod to display details

    public void displayInfo(){
        System.out.println("The Max Speed of the vehicle :"+maxSpeed);
        System.out.println("The Fuel Type of the vehicle "+fuelType);

    }
}


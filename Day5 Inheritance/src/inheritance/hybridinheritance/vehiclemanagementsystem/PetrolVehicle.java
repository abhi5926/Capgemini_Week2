package inheritance.hybridinheritance.vehiclemanagementsystem;

// Creating class name as PetrolVehicle
public class PetrolVehicle extends Vehicle {
    // Attributes
    int fuelLevel;

    // Creating Constructer
    public PetrolVehicle(int maxSpeed,String model,int fuelLevel){
        super(maxSpeed, model);
        this.fuelLevel = fuelLevel;
    }
    // Method to display data
    public void displayInfo(){
        System.out.println("The max Speed of the Vehicle :"+ maxSpeed);
        System.out.println("The Model of the Vehicle :"+ model);
        System.out.println("The Fuel Level of the Vehicle :"+fuelLevel);

    }
}


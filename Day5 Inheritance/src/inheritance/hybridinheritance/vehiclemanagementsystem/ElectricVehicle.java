package inheritance.hybridinheritance.vehiclemanagementsystem;

// Creating class Name as ElectricVehicle
public class ElectricVehicle extends Vehicle{
    // Attributes
    int batteryLevel;

    // Creating Constructer
    public ElectricVehicle(int maxSpeed,String model,int batteryLevel){
        super(maxSpeed,model);
        this.batteryLevel =batteryLevel;
    }

    // Method to Display data
    public void displayInfo(){
        System.out.println("The max Speed of the Electric Vehicle :"+maxSpeed);
        System.out.println("The model of the Vehicle :"+model);
        System.out.println("The battery Level of the Vehicle :"+batteryLevel);
    }
}


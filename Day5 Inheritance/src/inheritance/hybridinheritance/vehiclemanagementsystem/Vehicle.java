package inheritance.hybridinheritance.vehiclemanagementsystem;

// Creating class Name as Vehicle
public class Vehicle {
    // Attributes
    int maxSpeed;
    String model;

    // Constructer
    public Vehicle(int maxSpeed , String model){
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
    // Method to display Data
    public void displayInfo(){
        System.out.println("The max Speed of the Vehicle "+maxSpeed +"Km");
        System.out.println("The Model of the Vehicls :"+model);
    }
}

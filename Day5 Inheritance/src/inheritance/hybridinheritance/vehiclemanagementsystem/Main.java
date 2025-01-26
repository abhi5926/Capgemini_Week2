package inheritance.hybridinheritance.vehiclemanagementsystem;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Creating Object of the Vehicle class
        Vehicle ob = new Vehicle(60,"2025");
        // Display method to display Details
        ob.displayInfo();

        // Creating Object of the ElectricVehicle class
        ElectricVehicle ob1 = new ElectricVehicle(70,"2024",95);
        // Display method to display Details
        ob1.displayInfo();


        // Creating Object of the PetrolVehicle class
        PetrolVehicle ob2 =new PetrolVehicle(180,"2023",6);
        // Display method to display Details
        ob2.displayInfo();
    }
}

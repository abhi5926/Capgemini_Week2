import java.util.Scanner;
import java.util.*;
// Vehicle class
public class Vehicle {
    // Instance variables
    String ownerName;
     String vehicleType;
	 final String registrationNumber;


    // Class variable (shared among all vehicles)
     static double registrationFee = 200.0; 

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType,String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
		this.registrationNumber = registrationNumber;
    }

    // Instance method to display vehicle details
    public  void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
		System.out.println("Registration Number : $" + registrationNumber);
    }

    // Class method to update the registration fee for all vehicles
    public static void updateRegistrationFee(double newRegistrationFee) {
        registrationFee = newRegistrationFee;
        System.out.println("Updated Registration Number : " + registrationFee);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Creating the object of Scanner Class
		Scanner sc = new Scanner(System.in);
		
		//Taking owner name as input
		System.out.println("Please Enter the name of Owner :");
		String ownerName = sc.nextLine();
		
		//Taking vehicle type as input
		System.out.println("Please Enter the vehicle type :");
		String vehicleType = sc.nextLine();
		
		//Taking Registration number as input
		System.out.println("Please Enter Registration Number :");
		String registrationNumber = sc.nextLine();
		
		// Creating the object of Vehicle class
		Vehicle ob = new Vehicle(ownerName, vehicleType , registrationNumber);
		 // Chacking the object ob belons to vehcle class or not 
		 if(ob instanceof Vehicle){
			 System.out.println("The object ob Belongs to the Vehicle class :");
		 }else{
			 System.out.println("The object ob Not Belongs to the Vehicle class :");
		 }
		 
		 // Display the data of Vehicle class
		 ob.displayVehicleDetails();
		 
		 //updating Registration Fees
		 updateRegistrationFee(500);
		 
		 // Display the data of Vehicle class
		 ob.displayVehicleDetails();
		 
		 
    }
}

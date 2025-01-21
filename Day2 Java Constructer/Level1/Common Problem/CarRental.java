//importing packages
import java.util.Scanner;
import java.util.*;
 
 //creating class 
class CarRental {

   // Declearing attributes of class
   String cutomerName;
   String carModel;
   int rentalDays;
   int costOneDay;
   
   // Creating parameterized constructer
   public CarRental(String cutomerName,String carModel,int rentalDays,int costOneDay){
      this.cutomerName = cutomerName;
	  this.carModel  = carModel;
	  this.rentalDays = rentalDays;
	  this.costOneDay = costOneDay;
   }
  // Creating method to calculate total costOneDay
   public double cost(int rentalDays,int costOneDay){
      int totalCost=rentalDays * costOneDay;
	  return totalCost;
   }
   public void display(){
      System.out.println("The name of the customer is "+cutomerName);
	  System.out.println("The model of the car is "+carModel);
	  System.out.println("The Rental Days of the car "+rentalDays);
	  System.out.println("The cost of the car of one day "+costOneDay);
	  System.out.println("The total cost of the car of the rental days "+cost(rentalDays,costOneDay));
   }
   public static void main(String[] args){
      // Creating the object of Scanner class
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Please Enter  the customer name  :");
	  String cutomerName = sc.nextLine();
	  
	   System.out.println("Please Enter  the Model of the car  :");
	  String CarModel = sc.nextLine();
	  
	   System.out.println("Please Enter  the Rental days of the car");
	  int rentalDays = sc.nextInt();
	  
	  
	   System.out.println("Please Enter  the one day cost of car :");
	  int costOneDay = sc.nextInt();
	   
	   //creating object of  CarRental class
	   CarRental ob = new CarRental(cutomerName,CarModel,rentalDays,costOneDay);
	   ob.display();
   }
   }
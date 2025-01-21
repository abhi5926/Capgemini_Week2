import java.util.Scanner;
import java.util.*;

// Creating class as name HotelBooking
class HotelBooking {
    //Creating following attributes for class HotelBooking
      String guestName;
	  String roomType;
	  int nights;
	  
	  // Creating a Default Constructer
	  public HotelBooking(){
	    
		  this.guestName = "Abhishek";
		  this.roomType = "Ac Room";
		  this.nights = 2;
	  }
	   
	   //Creating Parameterized Constructer
	   	  public HotelBooking(String guestName,String roomType , int nights){
	    
		  this.guestName = guestName;
		  this.roomType = roomType;
		  this.nights = nights;
	  }
	  
	  //Creating Copy Constructer//Creating Parameterized Constructer
	   	  public HotelBooking(HotelBooking ob){
	    
		  this.guestName = ob.guestName;
		  this.roomType = ob.roomType;
		  this.nights = ob.nights;
	  }
	  
	  //Creating Display function
	  
	  public void display(){
	    System.out.println("The name of the guest is "+guestName);
		System.out.println("The Room Type of the guest is "+roomType);
		System.out.println("The Booking  of the nights of guest is "+nights);
	  }
} 

public class HotelBookingMain {
      public static void main(String[] args){
	     // Creating object of the Scanner class
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Please Enter the name of the guest:");
		 String guestName=sc.nextLine();
		 
		 System.out.println("Please Enter the Room type of the guest :");
		 String roomType=sc.nextLine();
		 
		  System.out.println("Please Enter the Room nights Booking of the guest :");
		 int nights=sc.nextInt();
		 
		 System.out.println("Output from parameterized constructer");
		 //Ctreating the object of the class
		 HotelBooking ob = new HotelBooking(guestName,roomType,nights);
		 ob.display();
		 
		 System.out.println("Output from Copy constructer");
		 HotelBooking ob1 = new HotelBooking(ob);
		 ob1.display();
		 
		 System.out.println("Output from Default constructer");
		 HotelBooking ob2 = new HotelBooking();
		 ob2.display();
	  }
}
import java.util.Scanner;
import java.util.*;

//Creating the class of name MobilePhone
class MobilePhone {

   //Declearing MobilePhone class Attribute As brand ,model, price 
  String brand;
String model;
  float price;
  
    
   //Parameterized Constructer Creating 
   public MobilePhone(String brand, String model , float price){
      this.brand = brand;
	  this.model = model;
	  this.price = price;
	  
   }
     
	 //Creating Method to Display 
   public void display(){
    
	   
      System.out.println("The brand of the MobilePhone "+ brand);
	  System.out.println("The Model of the MobilePhone "+ model);
      System.out.println("The Price of the MobilePhone "+ price);
	 
   }
}

public class MobilePhoneMain {
   public static void main(String[] args) {

      //Creating Scanner Class Object
      Scanner sc = new Scanner(System.in);

      // taking user input as a Brand Of MobilePhone
      System.out.println("Please Enter the Brand of Mobile Phone ");
      String  brand = sc.nextLine();
     
	 
	  // taking user input as a Model of Mobile Phone
      System.out.println("Please Enter the Model of Mobile Phone");
      String model = sc.nextLine();
	  
	   // taking user input as a Price
      System.out.println("Please Enter the Price of Mobile Phone");
      float  price = sc.nextFloat();
	  
	  
       //creating object of  class
       MobilePhone ob = new MobilePhone(brand,model,price);

        // calling the display method using object 
        ob.display();
   }
}
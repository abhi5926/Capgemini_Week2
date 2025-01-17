import java.util.Scanner;
import java.util.*;

//Creating the class of name Item
class Item {

   //Declearing Book class Attribute As name ,item code , price , item name,quantity
  String itemCode;
String itemName;
  float price;
  int quantity;
    
   //Parameterized Constructer Creating 
   public Item(String itemCode, String itemName , float price,int quantity){
      this.itemCode = itemCode;
	  this.itemName = itemName;
	  this.price = price;
	  this.quantity = quantity;
   }
     
	 //Creating Method to Display 
   public void display(){
    
	    float totalCost = price * quantity;
      System.out.println("the code of Item "+ itemCode);
	  System.out.println("The Name of Item "+ itemName);
      System.out.println("Price of the Item "+ price);
	  System.out.println("Quantity of the Item "+ quantity);
	  System.out.println("Total cost of the Item "+ totalCost);
   }
}

public class ItemMain {
   public static void main(String[] args) {

      //Creating Scanner Class Object
      Scanner sc = new Scanner(System.in);

      // taking user input as a ItemCode
      System.out.println("Please Enter the Item  Code");
      String  itemCode = sc.next();
     
	 
	  // taking user input as a Item Name
      System.out.println("Please Enter the Item Name");
      String itemName = sc.next();
	  
	   // taking user input as a Price
      System.out.println("Please Enter the Price of Item");
      float  price = sc.nextFloat();
	  
	  // taking user input as a Quantity
      System.out.println("Please Enter the Quantity of Item");
      int  quantity = sc.nextInt();
	  
       //creating object of employee class
       Item ob = new Item(itemCode,itemName,price,quantity);

        // calling the display method using object 
        ob.display();
   }
}
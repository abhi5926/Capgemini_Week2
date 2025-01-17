import java.util.Scanner;
import java.util.*;

//Creating the class of name Book
class Book {

   //Declearing Book class Attribute As name ,title , price
  String title;
  String author;
  float price;
    
   //Parameterized Constructer Creating 
   public Book(String title, String author , float price){
      this.title = title;
	  this.author = author;
	  this.price = price;
   }
     
	 //Creating Method to Display 
   public void display(){
   
      System.out.println("Title of Book "+ title);
	  System.out.println("Author of Book "+ author);
      System.out.println("Price of the Book "+ price);
   }
}

public class BookMain {
   public static void main(String[] args) {

      //Creating Scanner Class Object
      Scanner sc = new Scanner(System.in);

      // taking user input as a title
      System.out.println("Please Enter the title of Book");
      String  title = sc.nextLine();
     
	 
	  // taking user input as a Author Name
      System.out.println("Please Enter the Author Name");
      String author = sc.nextLine();
	  
	   // taking user input as a Price
      System.out.println("Please Enter the Price of Book");
      float  price = sc.nextFloat();
	  
	  
       //creating object of employee class
       Book ob = new Book(title,author,price);

        // calling the display method using object 
        ob.display();
   }
}
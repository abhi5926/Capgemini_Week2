import java.util.Scanner;
import java.util.*;

//Creating the class of name Book
class Book {

   //Declearing Book class Attribute As name ,title , price
    static String liberaryName;
  String title;
  String author;
 final String isbn;
    
   //Parameterized Constructer Creating 
   public Book(String title, String author , String isbn){
      this.title = title;
	  this.author = author;
	  this.isbn = isbn;
   }
     
	 //Creating Method to Display 
   public void display(){
   
      System.out.println("Title of Book "+ title);
	  System.out.println("Author of Book "+ author);
      System.out.println("Price of the Book "+ isbn);
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
      System.out.println("Please Enter isbn :");
      String  isbn = sc.nextLine();
	  
	  //creating object of employee class
       Book ob = new Book(title,author,isbn);
	   
	   // Creating Method to check if the instance is belongs to Book class or not
	  if(ob instanceof Book){
		  System.out.println("The object ob of Book class Belongs to the Book class :");
	  }else{
		  System.out.println("The object ob of Book class Not Belongs to the Book class :");
	  }
   
        // calling the display method using object 
        ob.display();
   }
}
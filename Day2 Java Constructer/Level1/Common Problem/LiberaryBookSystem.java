import java.util.Scanner;
import java.util.*;
// creating class name as LiberaryBookSystem

public class LiberaryBookSystem {
   // creating attributes of the class 
   String title;
   String author;
   double price;
   boolean avilability;
   
   // constructor to initialize the LiberaryBookSystem;
   public LiberaryBookSystem(String title,String author,double price,boolean avilability){
    this.title = title;
		this.author = author;
		this.price = price;
		this.availability = availability;
}

    //method to borrow the book
	public void borrow(){
	if(avilability){
	   avilability =false; // mark as unavilable
	   System.out.println("The book "+title+" is successfully borrowed.");
	}else{
	System.out.println("The book "+title+" is unavilable.");
	}
	}
	public void returnBook() {
		availability = true; // Mark as available again
		System.out.println("The book '" + title + "' has been returned successfully.");
	}
		// Method to get the details of the book
	
	public String toString() {
		String status = availability ? "Available" : "Unavailable";
		return "Title: " + title + "\nAuthor: " + author + "\nPrice: $" + String.format("%.2f", price) + "\nStatus: " + status;
	}
	//Main method
	public static void main(String args[]){
	  // Print details of book1 and try to borrow it
		
		LiberaryBookSystem book1 = new LiberaryBookSystem("Learn Java", "James Gosling", 15.99, true);
		LiberaryBookSystem book2 = new LiberaryBookSystem("Learn C++", "Bjarne Stroustrup", 12.99, false);
		// Print details of book1 and try to borrow it
		System.out.println(book1);
		book1.borrow();
		
		// Print details of book1 and try to borrow it
		System.out.println(book1);
		book1.borrow();
		
		// Return book1
		book1.returnBook();
	}
}

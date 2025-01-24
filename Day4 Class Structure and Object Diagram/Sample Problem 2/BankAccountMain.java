//importing liberaries
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

//Creating class as Name Bank
class Bank {
    // Defining Attributes
	private String bankName;
	private String branch;
	
	
	
	//Creating parameterized Constructor
	public Bank(String bankName, String branch){
	  this.bankName = bankName;
	  this.branch = branch;
	}
	//Method to diaplay bank details
	public void bankDetailDisplay(){
		System.out.println("Bank name is :" + bankName);
		System.out.println("Bank Branch name is :" + branch);
	}
	  //Method to open Account in Bank
	public Customer openAccount(){
	   Customer ob= new Customer();
	   ob.getAccountDetail();
	   return ob;
	}
}
// Creating class name as Customer
class Customer { 
  
   // creating the object of Scanner class
   Scanner sc = new Scanner(System.in);
   
    // Defining Attributes
	String custName;
	int custAge;
    double balance;
	
	// Default Constructer
	Customer(){
	this.custName = "Abhishek";
	this.custAge = 18;
	this.balance = 500;
	}
	// Method to get ccount Detail
	public void getAccountDetail(){
	   System.out.println("Please Enter the name :");
	   custName = sc.nextLine();
	   
	   System.out.println("Please Enter the age :");
	   custAge = sc.nextInt();
	   
	   System.out.println("Please Enter the balance minimum 500 rupees :");
	   balance = sc.nextDouble();
	}
	public void cutomerDetailDisplay(){
		System.out.println("Customer name :"+custName);
		System.out.println("Customer Age :"+custAge);
		
	}
	public void viewBalance(){
	  System.out.println("Your Availabe Balance is :" + balance);
	}
	
}
// Creating class name BankAccountMain that contain main function
class BankAccountMain {
     public static void main(String[] args){
	     
		  // Creating object of Bank class
	      Bank bank1 = new Bank("SBI" , "Biaora");
		  
		  
		  // Calling Open Account Method
		  bank1.openAccount();
		  
		  // Creating object of Customer class
		  Customer cust1 = bank1.openAccount();
		  bankDetailDisplay()
		  //Display the customer Detail
		  cust1.cutomerDetailDisplay();
		  //Display the account balance
		  cust1.viewBalance();
	 }
} 
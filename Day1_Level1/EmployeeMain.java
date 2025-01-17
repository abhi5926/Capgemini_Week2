import java.util.Scanner;
import java.util.*;

//Creating the class of name Employee
class Employee {
   //Creating the attribute of Employee class
   String Name;
   String Id;
   float Sallary;
    
   //Parameterized Constructer Creating 
   public Employee(String name, String Id,float sallary){
      this.Name = name;
      this.Id = Id;
      this.Sallary  = sallary;
   }
     
   //Creating Method to Display Employee Data
   public void display(){
      System.out.println("Employee name is "+ Name);
      System.out.println("Employee Id is "+ Id);
      System.out.println("Employee sallary is "+ Sallary);
   }
}

public class EmployeeMain{
   public static void main(String[] args) {

      //Creating Scanner Class Object
      Scanner sc = new Scanner(System.in);

       // taking user input as a name 
      System.out.println("Please Enter the name of Employee");
      String name = sc.nextLine();
       // taking user input as a Id 
      System.out.println("Please Enter the id of Employee");
      String Id = sc.next();
      // taking user input as a sallary
      System.out.println("Please Enter the Sallary  of Employee");
      float sallary = sc.nextFloat();
     
       //creating object of employee class
       Employee ob = new Employee(name, Id,sallary);

        // calling the display method using object 
        ob.display();
   }
}
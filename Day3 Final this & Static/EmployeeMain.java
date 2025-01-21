import java.util.Scanner;

// Creating the class named Employee
class Employee {
   // Creating the attributes of the Employee class
   String companyName;
   String Name;
   final String Id;
   float Sallary;
   static int count = 0; // Static variable to keep track of employee count
   String designation;
   
   // Default constructor
   public Employee() {
      Id = "123";  // Default value for Id
   }

   // Parameterized constructor to create Employee with specific details
   public Employee(String name, String Id, float sallary, String designation, String companyName) {
      count++;  // Incrementing the employee count
      this.Name = name;
      this.Id = Id;
      this.Sallary = sallary;
      this.designation = designation;
      this.companyName = companyName;
   }

   // Method to display the total number of employees
   public void displayTotalEmployees() {
      System.out.println("Total number of Employees is: " + count);
   }

   // Method to display employee data
   public void display() {
      System.out.println("Employee name: " + Name);
      System.out.println("Employee Id: " + Id);
      System.out.println("Employee salary: " + Sallary);
      System.out.println("Employee Company Name: " + companyName);
      System.out.println("Employee Designation: " + designation);
   }
}

public class EmployeeMain {
   public static void main(String[] args) {
      // Creating Scanner class object for user input
      Scanner sc = new Scanner(System.in);

      // Taking user input for employee details
      System.out.println("Please Enter the name of Employee:");
      String name = sc.nextLine();  // Read full line for name

      System.out.println("Please Enter the ID of Employee:");
      String Id = sc.nextLine();  // Read full line for ID

      System.out.println("Please Enter the Salary of Employee:");
      float sallary = sc.nextFloat();  // Read salary as float

      sc.nextLine();  // Consume the remaining newline character

      System.out.println("Please Enter the Company name:");
      String companyName = sc.nextLine();  // Read company name

      System.out.println("Please Enter the Designation:");
      String designation = sc.nextLine();  // Read designation

      // Creating object of Employee class
      Employee ob = new Employee(name, Id, sallary, designation, companyName);

      // Checking if the object is an instance of Employee class
      if (ob instanceof Employee) {
         System.out.println("The object 'ob' belongs to the Employee class.");
      } else {
         System.out.println("The object 'ob' does NOT belong to the Employee class.");
      }

      // Printing total number of employees
      ob.displayTotalEmployees();

      // Calling the display method to show employee details
      ob.display();

      // Closing the scanner object
      sc.close();
   }
}

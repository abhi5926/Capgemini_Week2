import java.util.Scanner;
import java.util.*;

//Creating the class of name Student
class Student {

   //Declearing Student class Attribute As name ,rollNumber, marks 
  String name;
  String rollNumber;
  int marks;
  char grade;
    
   //Parameterized Constructer Creating 
   public Student(String name, String rollNumber, int marks){
      this.name = name;
	  this.rollNumber = rollNumber;
	  this.marks = marks;
	  
   }
   
     
	   public static char gradeCalculate(int marks) {
        // Assign grade based on marks
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else if (marks >= 50) {
            return 'E';
        } else {
            return 'F';
        }
    }
     
	 
	 //Creating Method to Display 
   public void display(){
      System.out.println("The Name Of Student "+ name);
	  System.out.println("The RollNumber of Student "+ rollNumber);
      System.out.println("The Marks of the Student "+ marks);
	 System.out.println("The Grade of the Student "+ gradeCalculate(marks));
   }
}

public class StudentMain {
   public static void main(String[] args) {

      //Creating Scanner Class Object
      Scanner sc = new Scanner(System.in);

      // taking user input as a Name of Student
      System.out.println("Please Enter the Name of Student ");
      String  name = sc.nextLine();
     
	 
	  // taking user input as a Roll Number
      System.out.println("Please Enter the Roll Number of Student");
      String rollNumber = sc.nextLine();
	  
	   // taking user input as a Marks
      System.out.println("Please Enter the Marks of Student");
      int  marks = sc.nextInt();
	  
	  
       //creating object of  class
       Student ob = new Student(name,rollNumber,marks);

        // calling the display method using object 
        ob.display();
   }
}
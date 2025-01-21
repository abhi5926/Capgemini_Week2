import java.util.Scanner;
import java.util.*;

//Creating the class of name Student
class Student {

   //Declearing Student class Attribute As name ,rollNumber, marks 
   static String universityName = "RGPV University";
  String name;
  final String rollNumber;
  int marks;
  char grade;
  static int count=0;
    
   //Parameterized Constructer Creating 
   public Student(String name, String rollNumber, int marks){
	   count++;
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
     // Creating function to display total number of Students
	 public void displayTotalStudents(){
		  System.out.println("The total Number Of Student "+ count);
	 }		 
	 
	 //Creating Method to Display 
   public void display(){
      System.out.println("The Name Of Student "+ name);
	  System.out.println("The RollNumber of Student "+ rollNumber);
      System.out.println("The Marks of the Student "+ marks);
	 System.out.println("The Grade of the Student "+ gradeCalculate(marks));
	 System.out.println("The University name is :"+ universityName);
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
	   
	   // check the ob object belongs to the class Student or not
	   if(ob instanceof Student){
		   System.out.println("The object ob is belongs to the class Student :");
   }else{
	   System.out.println("The object ob is Not belongs to the class Student :");
   }
       // Display total number of Students
	   ob.displayTotalStudents();
        // calling the display method using object 
        ob.display();
   }
}
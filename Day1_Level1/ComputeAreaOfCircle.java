import java.util.Scanner;
import java.util.*;

//Creating the class of name AreaOfCircle
class AreaOfCircle {

   //Declearing radius as attribute
   float radius;
    
   //Parameterized Constructer Creating 
   public AreaOfCircle(int radius){
      this.radius = radius;
   }
     
	 //Creating Method to Display Areao of Circle and calculating Area of circle and circumfrence of circle
   public void display(){
   double result = 3.14 * radius * radius;
      System.out.println("The Area of Circle "+ result);
	  double circumference = 2 * 3.14 * radius;
      System.out.println("The Circumference of Circle "+ circumference);
   }
}

public class ComputeAreaOfCircle {
   public static void main(String[] args) {

      //Creating Scanner Class Object
      Scanner sc = new Scanner(System.in);

      // taking user input as a radius
      System.out.println("Please Enter the radius of circle");
      int  radius = sc.nextInt();
     
       //creating object of employee class
       AreaOfCircle ob = new AreaOfCircle(radius);

        // calling the display method using object 
        ob.display();
   }
}
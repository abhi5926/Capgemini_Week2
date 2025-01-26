package inheritance.hierarchicalinheritance.schoolsystem;

// Creating class Name as Student
public class Student extends Parson {
    //Attributes
    String grade;


    //Constructor
    public Student(String name,int age,String grade){
        super(name,age);
        this.grade = grade;
    }
    // Method to Display Role
    public void display(){
        System.out.println("I am a Student");
        System.out.println("The name of the Student is :"+name);
        System.out.println("The age of the Student is :"+age);
        System.out.println("The grade of the Student is :"+grade);
    }
}

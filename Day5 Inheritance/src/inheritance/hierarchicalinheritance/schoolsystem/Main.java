package inheritance.hierarchicalinheritance.schoolsystem;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Creating the object of the class Parson
        Parson ob =new Parson("Abhishek",22);
        ob.displayRole();

        // Creating the object of the class Teacher
        Teacher ob1 = new Teacher("Rajan",21,"Maths");
        ob1.displayRole();
        Student student = new Student("Neeraj", 16, "10th Grade");
        student.displayRole();
        Staff staff = new Staff("Sachin", 40, "Maintenance");
        staff.displayRole();

    }
}

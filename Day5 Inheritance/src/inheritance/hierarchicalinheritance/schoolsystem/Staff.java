package inheritance.hierarchicalinheritance.schoolsystem;

// Creating class Name as Staff
public class Staff extends Parson{
    // Attributes
    String department;

    // Creating Constructor
    public Staff(String name,int age,String department){
        super(name,age);
        this.department = department;
    }
    // Method to display role
    public void displayRole() {
        System.out.println("I am the Staff :");
        System.out.println("The name of the Staff :"+name);
        System.out.println("The age of the Staff :"+age);
        System.out.println("The Department of the Staff :"+department);
    }
}


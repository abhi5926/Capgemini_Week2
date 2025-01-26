package inheritance.hierarchicalinheritance.schoolsystem;

// Creating Super class as Parson
public class Parson {
    // Attributes
    String name;
    int age;

    // Creating Constructor
    public Parson(String name,int age){
        this.name = name;
        this.age =age;
    }
    // Method to Display Role
    public void displayRole(){
        System.out.println("I am Parson");
        System.out.println("The name of the Parson :"+name);
        System.out.println("The age of the Parson :"+age);
    }
}


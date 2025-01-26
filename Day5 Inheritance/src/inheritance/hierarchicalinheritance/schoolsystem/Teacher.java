package inheritance.hierarchicalinheritance.schoolsystem;

// Creating class Teacher that extends Student class
public class Teacher extends Parson{
    //Attributes
    String subject;

    // Creating Constructer
    public Teacher(String name,int age,String subject){
        super(name,age);
        this.subject =subject;
    }
    //Method to Display role
    public void displayRole(){
        System.out.println("The name of a teacher :"+name);
        System.out.println("The age of a teacher :"+age);
        System.out.println("The subject of a teacher :"+subject);
    }
}

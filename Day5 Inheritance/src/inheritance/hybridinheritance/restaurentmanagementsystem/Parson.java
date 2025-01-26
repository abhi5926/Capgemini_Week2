package inheritance.hybridinheritance.restaurentmanagementsystem;

// Creating class Name as Parson
public class Parson {
    // Attribute
    String name;
    String id;

    // Creating Constructor
    public Parson(String name, String id){
        this.name = name;
        this.id =id;
    }
    // Method to print Details
    public void performDuties(){
        System.out.println("The name of the parson :"+ name);
    }
}

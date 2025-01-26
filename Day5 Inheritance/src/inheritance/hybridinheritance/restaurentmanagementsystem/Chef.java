package inheritance.hybridinheritance.restaurentmanagementsystem;

// Creating Chef class that extending Parson Class
public class Chef extends Parson {
    // Creating  Constructor
    public Chef(String name , String id){
        super(name,id);
    }
    // Method to print Details
    public void performDuties(){
        System.out.println("Chef Prepare Meal in Kitchen :");
        System.out.println("Name of the chef :" +name);
        System.out.println("The Id of the chef :"+id);
    }
}

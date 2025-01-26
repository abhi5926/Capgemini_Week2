package inheritance.hybridinheritance.restaurentmanagementsystem;

// Creating class Name as Waiter extends Parson
public class Waiter extends Parson{
    // Creating Constructer
    public Waiter(String name,String id){
        super(name,id);
    }
    // Method to print Detail
    public void performDuties(){
        System.out.println("The Waiter is Serving Food to the Customer :");
        System.out.println("The Name of the Waiter :"+name);
        System.out.println("The Id of the Waiter :"+id);
    }
}

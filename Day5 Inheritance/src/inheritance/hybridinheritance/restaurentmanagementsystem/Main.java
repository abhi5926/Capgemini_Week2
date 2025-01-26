package inheritance.hybridinheritance.restaurentmanagementsystem;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Creating object of the class
        Chef ob = new Chef("Abhishek","CS123");
        //Method to print Details
        ob.performDuties();

        // Creating object of Another class
        Waiter ob1 =new Waiter("Neeraj","CS567");
        //Method to print Details
        ob1.performDuties();
    }
}

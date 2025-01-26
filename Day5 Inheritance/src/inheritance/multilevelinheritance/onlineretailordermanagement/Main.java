package inheritance.multilevelinheritance.onlineretailordermanagement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Creating object of Class
        DeliveredOrder ob = new DeliveredOrder("124","12 May 2024",11234,"16 May 2024");
        // Method to get about Status
        ob.getOrderStatus();
        // Method to display details
        ob.display();

    }
}

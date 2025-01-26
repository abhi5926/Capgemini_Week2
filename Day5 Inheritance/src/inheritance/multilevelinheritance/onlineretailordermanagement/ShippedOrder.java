package inheritance.multilevelinheritance.onlineretailordermanagement;
// Creating a Subclass Shipped Order
public class ShippedOrder extends Order {
    // Attributes
    int trackingNumber;

    // Creating Constructor
    public ShippedOrder(String orderId,String orderDate,int trackingNumber){
        super(orderId,orderDate);
        this.trackingNumber = trackingNumber;
    }
}

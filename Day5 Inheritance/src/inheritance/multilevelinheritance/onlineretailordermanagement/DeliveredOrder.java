package inheritance.multilevelinheritance.onlineretailordermanagement;

// Creating class name as
public class DeliveredOrder extends ShippedOrder{
    // Attributes
    String deliveryDate;

    // Creating Constructor
    public DeliveredOrder(String orderId,String orderDate,int trackingNumber,String deliveryDate){
        super(orderId,orderDate,trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    // Creating Method to Display Details
    public void getOrderStatus(){
        System.out.println("Order Status :  Delivered");
    }
    // Method to Dispaly details
    public void display(){
        System.out.println("The OrderId is :" +orderId);
        System.out.println("The order Date is :"+orderDate);
        System.out.println("The Order Tracking Number :"+trackingNumber);
        System.out.println("The order Delivery Date :"+deliveryDate);

    }
}


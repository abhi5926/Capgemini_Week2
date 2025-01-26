package onlinefooddeliverysystem;

// Creating main class OnlineFoodDeliverySystem
public class OnlineFoodDeliverySystem
{
    public static void main(String[] args){
        // Creating object for VegItem and NonVegItem
        FoodItem ob = new VegItem("Paneer Tikka", 150, 2);
        FoodItem ob1 = new NonVegItem("Chicken Biryani", 200, 1);

        // Display Details
        ob.getItemDetails();
        ob1.getItemDetails();
    }
}

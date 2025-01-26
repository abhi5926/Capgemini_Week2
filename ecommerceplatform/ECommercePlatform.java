package ecommerceplatform;

// Main class to demonstrate the platform
public class ECommercePlatform {
    public static void main(String[] args) {
        // Create products
        Product ob = new Electronics(101, "Laptop", 1500.0, 10); // 10% discount
        Product ob1 = new Clothing(102, "T-Shirt", 30.0, 20); // 20% discount
        Product ob2 = new Groceries(103, "Apple", 2.0, 5); // 5% discount

        ob.display();
        ob1.display();
        ob2.display();
    }
}

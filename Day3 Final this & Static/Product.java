public class Product {
    // Static variable for discount shared by all products
    static double discount;

    // Instance variables for product attributes
    String productName;
    double price;
    int quantity;

    // Final variable for productID, to ensure it's unique and immutable
    final int productID;

    // Static method to update the discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Constructor to initialize productName, price, quantity, and productID
    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Method to calculate the total price after discount
    public double calculateTotalPrice() {
        double priceAfterDiscount = price * (1 - discount / 100);
        return priceAfterDiscount * quantity;
    }

    // Getter for productID (as it is final and cannot be changed)
    public int getProductID() {
        return productID;
    }

    // Optional: Override toString() for better display
    @Override
    public String toString() {
        return "Product ID: " + productID + ", Name: " + productName + ", Price: " + price + ", Quantity: " + quantity;
    }

    public static void main(String[] args) {
        // Example usage
        Product.updateDiscount(10); // Set a 10% discount
        Product p1 = new Product("Laptop", 1000, 2, 1);
        Product p2 = new Product("Smartphone", 500, 3, 2);
        // checking weather the object p1 is instance Product class or not
		if(p1 instanceof Product){
			System.out.println("The object p1 is instance of Product class :");
		}else{
			System.out.println("The object p1 is Not instance of Product class :");
		}
        System.out.println(p1);
        System.out.println("Total Price for p1 after discount: $" + p1.calculateTotalPrice());
        
        System.out.println(p2);
        System.out.println("Total Price for p2 after discount: $" + p2.calculateTotalPrice());
    }
}

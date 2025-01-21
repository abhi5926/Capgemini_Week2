public class Product {
    // Instance variables
    private String productName;
    private double price;

    // Class variable (shared among all products)
    private static int totalProducts = 0;

    // Constructor to initialize the product name and price
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment totalProducts whenever a new product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class method to display total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Creating product objects
        Product product1 = new Product("Laptop", 899.99);
        Product product2 = new Product("Smartphone", 599.49);
        Product product3 = new Product("Tablet", 299.99);

        // Displaying details for each product
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();

        // Displaying the total number of products created
        Product.displayTotalProducts();
    }
}

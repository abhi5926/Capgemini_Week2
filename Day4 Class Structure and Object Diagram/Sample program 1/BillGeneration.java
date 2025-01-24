//Creating class name as Product
class Product {
	// Attribute
    private String name;
    private double quantity;
    private double price;
    
	// Constructor
    public Product(String name, double quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    
	 //Method for returning name
    public String getName() {
        return name;
    }
     //Method for returning getQuantity
    public double getQuantity() {
        return quantity;
    }
     //Method for returning get price per unit
    public double getPricePerUnit() {
        return price;
    }
     // Method for calculate total price
    public double calculateTotalPrice() {
        return quantity * price;
    }
}
// creating class name as Customer
class Customer {
	// Attributes
    private String name;
    private Product[] products;
    private int productCount; 

    // Creating Constructor
    public Customer(String name, int maxProducts) {
        this.name = name;
        this.products = new Product[maxProducts]; 
        this.productCount = 0;
    }
    // Method to returning the cutomer name
    public String getName() {
        return name;
    }
     // // Method to add product
    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount] = product;
            productCount++;
        } else {
            System.out.println("Can't add more products. Cart is full.");
        }
    }
     // Method to get product 
    public Product[] getProducts() {
        return products;
    }
     // method to get product count
    public int getProductCount() {
        return productCount;
    }
}
// Class Bill generator
class BillGenerator {
    public double generateBill(Customer customer) {
        double total = 0;
        for (int i = 0; i < customer.getProductCount(); i++) {
            total += customer.getProducts()[i].calculateTotalPrice();
        }
        return total;
    }
}
class BillGeneration {
    public static void main(String[] args) {
        // Create products
        Product apples = new Product("Apples", 2, 3.0);  
        Product milk = new Product("Milk", 1, 2.0);   

        // Create customer with a max of 10 products in the cart
        Customer abhishek = new Customer("Abhishek", 10);

        // Add products to the customer’s cart
        abhishek.addProduct(apples);
        abhishek.addProduct(milk);

        // Create BillGenerator object
        BillGenerator billGenerator = new BillGenerator();

        // Generate the total bill for Alice
        double totalBill = billGenerator.generateBill(abhishek);

        // Output the total bill
        System.out.println("Total bill for " + abhishek.getName() + ": " + totalBill);
    }
}

class Product {
	// Attributes
    private String name;
    private double price;

    // Constructor to initialize Product
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters for name and price
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
class Order {
    private Product[] products; 
    private int productCount;   
    private static final int MAX_PRODUCTS = 5; 

    // Constructor to initialize the Order
    public Order() {
        products = new Product[MAX_PRODUCTS];
        productCount = 0;
    }

    // Method to add a product to the order
    public void addProduct(Product product) {
        if (productCount < MAX_PRODUCTS) {
            products[productCount] = product;
            productCount++;
        } else {
            System.out.println("Cannot add more products to this order.");
        }
    }

    // Method to calculate the total price of the order
    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < productCount; i++) {
            total += products[i].getPrice();
        }
        return total;
    }

    // Method to display the order details
    public void displayOrderDetails() {
        System.out.println("Order contains the following products:");
        for (int i = 0; i < productCount; i++) {
            System.out.println(products[i].getName() + " - $" + products[i].getPrice());
        }
        System.out.println("Total price: $" + calculateTotal());
    }
}
class Customer {
    private String name;
    private Order[] orders; 
    private int orderCount;  
    private static final int MAX_ORDERS = 3; 

    // Constructor to initialize the Customer
    public Customer(String name) {
        this.name = name;
        this.orders = new Order[MAX_ORDERS];
        this.orderCount = 0;
    }

    // Method to place an order
    public void placeOrder(Order order) {
        if (orderCount < MAX_ORDERS) {
            orders[orderCount] = order;
            orderCount++;
        } else {
            System.out.println("Cannot place more orders.");
        }
    }

    // Method to display all orders placed by the customer
    public void displayOrders() {
        System.out.println(name + " has placed the following orders:");
        for (int i = 0; i < orderCount; i++) {
            System.out.println("Order " + (i + 1) + ":");
            orders[i].displayOrderDetails();
        }
    }
}
class EcommerceMain {
    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product("Laptop", 1200.50);
        Product product2 = new Product("Smartphone", 800.99);
        Product product3 = new Product("Headphones", 150.75);
        

        // Create an order and add products to it
        Order order1 = new Order();
        order1.addProduct(product1);
        order1.addProduct(product2);
        order1.addProduct(product3);

        Order order2 = new Order();
        order2.addProduct(product2);
        order2.addProduct(product3);

        // Create a customer and place orders
        Customer customer1 = new Customer("Abhishek ");
        customer1.placeOrder(order1);
        customer1.placeOrder(order2);

        // Display all orders placed by the customer
        customer1.displayOrders();
    }
}

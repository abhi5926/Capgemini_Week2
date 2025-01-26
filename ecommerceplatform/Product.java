package ecommerceplatform;

// Abstract class Product
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Abstract method to calculate discount
    public abstract double calculateDiscount();

    // Getter and Setter methods (Encapsulation)
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to calculate and return final price
    public double calculateFinalPrice(Taxable taxable) {
        double discount = calculateDiscount();
        double tax = taxable.calculateTax();
        return price + tax - discount;
    }
    // Method to display data
    public void display(){
        System.out.println("The Product Id of the Product is :"+productId);
        System.out.println("The Name of the Product is :"+name);
        System.out.println("The Price of the Product is :"+price);
    }
}

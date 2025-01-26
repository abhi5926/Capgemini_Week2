package ecommerceplatform;

// Concrete class Clothing
class Clothing extends Product implements Taxable {
    private double discountPercentage;

    public Clothing(int productId, String name, double price, double discountPercentage) {
        super(productId, name, price);
        this.discountPercentage = discountPercentage;
    }


    public double calculateDiscount() {
        return getPrice() * discountPercentage / 100;
    }


    public double calculateTax() {
        return getPrice() * 0.05; // Assuming 5% tax for clothing
    }


    public String getTaxDetails() {
        return "Clothing Tax: 5%";
    }
}


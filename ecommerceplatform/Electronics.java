package ecommerceplatform;

// Concrete class Electronics
class Electronics extends Product implements Taxable {
    private double discountPercentage;

    public Electronics(int productId, String name, double price, double discountPercentage) {
        super(productId, name, price);
        this.discountPercentage = discountPercentage;
    }


    public double calculateDiscount() {
        return getPrice() * discountPercentage / 100;
    }


    public double calculateTax() {
        return getPrice() * 0.18; // Assuming 18% tax for electronics
    }


    public String getTaxDetails() {
        return "Electronics Tax: 18%";
    }
}


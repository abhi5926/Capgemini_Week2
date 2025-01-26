package ecommerceplatform;

// Concrete class Groceries
class Groceries extends Product {
    private double discountPercentage;

    public Groceries(int productId, String name, double price, double discountPercentage) {
        super(productId, name, price);
        this.discountPercentage = discountPercentage;
    }


    public double calculateDiscount() {
        return getPrice() * discountPercentage / 100;
    }
}


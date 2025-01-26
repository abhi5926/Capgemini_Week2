package onlinefooddeliverysystem;

// Creating VegItem class
class VegItem extends FoodItem implements Discountable {
    // Creating Constructor
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Overriding calculateTotalPrice method
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    // Implementing applyDiscount method
    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.1;  // 10% discount for Veg items
    }

    // Implementing getDiscountDetails
    @Override
    public void getDiscountDetails() {
        System.out.println("A 10% discount is applied to this VegItem.");
    }
}

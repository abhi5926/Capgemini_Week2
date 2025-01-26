package onlinefooddeliverysystem;

// Creating NonVegItem class
class NonVegItem extends FoodItem implements Discountable {

    // Creating Constructor
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Overriding calculateTotalPrice method
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() + 20;  // Adding 20 as an additional charge for non-veg items
    }

    // Implementing applyDiscount method
    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;  // 5% discount for NonVeg items
    }

    // Implementing getDiscountDetails method
    @Override
    public void getDiscountDetails() {
        System.out.println("A 5% discount is applied to this NonVegItem.");
    }
}

class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor to initialize the CartItem
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to get the total cost of this item (price * quantity)
    public double getTotalCost() {
        return price * quantity;
    }
}

class ShoppingCart {

    // Declare variables for the cart
    private CartItem item1;
    private CartItem item2;
    private CartItem item3;
    private int itemCount = 0;

    // Constructor to initialize the cart (can hold up to 3 items in this simplified version)
    public ShoppingCart() {
        item1 = null;
        item2 = null;
        item3 = null;
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        CartItem newItem = new CartItem(itemName, price, quantity);
        
        // Simple logic to add an item to the first available spot
        if (itemCount == 0) {
            item1 = newItem;
        } else if (itemCount == 1) {
            item2 = newItem;
        } else if (itemCount == 2) {
            item3 = newItem;
        } else {
            System.out.println("Cart is full. Cannot add more items.");
            return;
        }
        itemCount++;
        System.out.println(itemName + " added to the cart.");
    }

    // Method to remove an item from the cart by name
    public void removeItem(String itemName) {
        if (item1 != null && item1.itemName.equals(itemName)) {
            item1 = null;
            itemCount--;
            System.out.println(itemName + " removed from the cart.");
        } else if (item2 != null && item2.itemName.equals(itemName)) {
            item2 = null;
            itemCount--;
            System.out.println(itemName + " removed from the cart.");
        } else if (item3 != null && item3.itemName.equals(itemName)) {
            item3 = null;
            itemCount--;
            System.out.println(itemName + " removed from the cart.");
        } else {
            System.out.println(itemName + " not found in the cart.");
        }
    }

    // Method to display the total cost of items in the cart
    public void displayTotalCost() {
        double totalCost = 0;
        if (item1 != null) totalCost += item1.getTotalCost();
        if (item2 != null) totalCost += item2.getTotalCost();
        if (item3 != null) totalCost += item3.getTotalCost();
        System.out.println("Total cost of items in the cart: $" + totalCost);
    }

    // Method to display all items in the cart
    public void displayCartItems() {
        if (item1 != null) {
            System.out.println("Item: " + item1.itemName + ", Price: $" + item1.price + ", Quantity: " + item1.quantity + ", Total: $" + item1.getTotalCost());
        }
        if (item2 != null) {
            System.out.println("Item: " + item2.itemName + ", Price: $" + item2.price + ", Quantity: " + item2.quantity + ", Total: $" + item2.getTotalCost());
        }
        if (item3 != null) {
            System.out.println("Item: " + item3.itemName + ", Price: $" + item3.price + ", Quantity: " + item3.quantity + ", Total: $" + item3.getTotalCost());
        }
        if (itemCount == 0) {
            System.out.println("The cart is empty.");
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding items to the cart
        cart.addItem("Laptop", 1000.00, 1);
        cart.addItem("Phone", 500.00, 2);
        cart.addItem("Headphones", 150.00, 3);

        // Displaying all items in the cart
        cart.displayCartItems();

        // Displaying the total cost
        cart.displayTotalCost();

        // Removing an item from the cart
        cart.removeItem("Phone");

        // Displaying updated cart and total cost
        cart.displayCartItems();
        cart.displayTotalCost();
    }
}

package liberarymanagementsystem;

// Creating Class for DVD
class DVD extends LibraryItem implements Reservable {
    // Attributes
    private boolean isAvailable;

    // Creating Constructor
    public DVD(String itemId, String title, String author, boolean isAvailable) {
        super(itemId, title, author);
        this.isAvailable = isAvailable;
    }

    public int getLoanDuration() {
        return 5;  // DVDs can be loaned for 5 days
    }

    // Method to reserve item
    public void reserveItem() {
        if (isAvailable) {
            System.out.println("DVD reserved successfully.");
            isAvailable = false;
        } else {
            System.out.println("DVD is not available for reservation.");
        }
    }
    // Method to check availability
    public void checkAvailability() {
        if (isAvailable) {
            System.out.println("DVD is available for loan.");
        } else {
            System.out.println("DVD is currently unavailable.");
        }
    }
}

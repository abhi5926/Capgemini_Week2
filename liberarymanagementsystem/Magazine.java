package liberarymanagementsystem;

// Creating Class for Magazine
class Magazine extends LibraryItem implements Reservable {
    // Attributes
    private boolean isAvailable;

    // Creating Constructor
    public Magazine(String itemId, String title, String author, boolean isAvailable) {
        super(itemId, title, author);
        this.isAvailable = isAvailable;
    }

    public int getLoanDuration() {
        return 7;  // Magazines can be loaned for 7 days
    }

    // Method to reserve item
    public void reserveItem() {
        if (isAvailable) {
            System.out.println("Magazine reserved successfully.");
            isAvailable = false;
        } else {
            System.out.println("Magazine is not available for reservation.");
        }
    }
    // Method to check availability
    public void checkAvailability() {
        if (isAvailable) {
            System.out.println("Magazine is available for loan.");
        } else {
            System.out.println("Magazine is currently unavailable.");
        }
    }
}


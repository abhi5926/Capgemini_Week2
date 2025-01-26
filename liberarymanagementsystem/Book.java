package liberarymanagementsystem;

// Creating Class for Book
class Book extends LibraryItem implements Reservable {
    // Attributes
    private boolean isAvailable;

    // Creating Constructor
    public Book(String itemId, String title, String author, boolean isAvailable) {
        super(itemId, title, author);
        this.isAvailable = isAvailable;
    }

    public int getLoanDuration() {
        return 14;  // Books can be loaned for 14 days
    }

    // Method to reserve item
    public void reserveItem() {
        if (isAvailable) {
            System.out.println("Book reserved successfully.");
            isAvailable = false;
        } else {
            System.out.println("Book is not available for reservation.");
        }
    }

    // Method to check availability
    public void checkAvailability() {
        if (isAvailable) {
            System.out.println("Book is available for loan.");
        } else {
            System.out.println("Book is currently unavailable.");
        }
    }
}

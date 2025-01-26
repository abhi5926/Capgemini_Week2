package liberarymanagementsystem;

// Creating Main class
public class LibraryManagementSystem {
    // Creating Main Method
    public static void main(String[] args) {
        // Creating object of the class
        LibraryItem book = new Book("B001", "Java Programming", "James Gosling", true);
        LibraryItem magazine = new Magazine("M001", "Tech World", "Abhishek", true);
        LibraryItem dvd = new DVD("D001", "Aptitude", "R.S. Agrawal", true);

        // Method to display data
        book.getItemDetails();
        magazine.getItemDetails();
        dvd.getItemDetails();


    }
}

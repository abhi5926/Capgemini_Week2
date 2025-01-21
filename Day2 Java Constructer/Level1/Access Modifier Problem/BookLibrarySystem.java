// Base class Book
class Book {
    // Instance variables with different access modifiers
    public String ISBN;  
    protected String title;  
    private String author;  
	
    // Constructor to initialize Book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to set the author 
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public method to get the author 
    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass EBook that inherits from Book
class EBook extends Book {

    // Constructor for EBook, calling the superclass constructor
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);  
    }

    // Method to display EBook details, demonstrating access to protected and public members
    public void displayEBookDetails() {
        // Accessing public member 'ISBN' and protected member 'title'
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN);  // Accessing public field 'ISBN'
        System.out.println("Title: " + title);  // Accessing protected field 'title'
        System.out.println("Author: " + getAuthor());  // Accessing private 'author' through getter
    }
}

// Main class to test the functionality
public class BookLibrarySystem {
    public static void main(String[] args) {
        // Create a regular Book object
        Book book = new Book("978-3-16-148410-0", "Java Programming", "John Smith");
        book.displayBookDetails();

        // Create an EBook object
        EBook eBook = new EBook("978-1-23-456789-0", "Mastering Java", "Jane Doe");
        eBook.displayEBookDetails();

        // Set and get author using setter and getter methods
        book.setAuthor("Michael Johnson");
        System.out.println("Updated Author of the Book:");
        System.out.println("Author: " + book.getAuthor());
    }
}

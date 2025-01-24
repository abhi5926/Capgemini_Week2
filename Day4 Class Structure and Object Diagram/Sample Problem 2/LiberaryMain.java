import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
// Book class with attributes 
class Book {
    private String title;
    private String author;

    // Constructor to initialize the book's title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void display(){
	  System.out.println("The title of the Book is :" +title);
	  	  System.out.println("The name of the Author of Book is :"+ author);
	}
}

// Creating Liberary class
class Library {
    private ArrayList<Book> books; 

    // Constructor to initialize the books list
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display 
    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            book.display();
        }
    }
}

public class LiberaryMain {
    public static void main(String[] args) {
        // creating instance of Book
		
        Book book1 = new Book("Learn Java", "James Gosling");
        Book book2 = new Book("Learn C++" , "Bjarne Stroustrup");
       

        // creating instance of Liberary
        Library library1 = new Library();
        

        // add books to the liberary
        library1.addBook(book1);
        library1.addBook(book2);
        

        // Display books in each library
        System.out.println("Library 1:");
        library1.displayBooks();

    }
}

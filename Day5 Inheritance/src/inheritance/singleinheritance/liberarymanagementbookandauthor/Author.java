package inheritance.singleinheritance.liberarymanagementbookandauthor;

// Creating class name as Author
public class Author extends Book {
    // Attributes of class
    String name;
    String bio;

    // Creating Constructor
    public Author(String name,String bio,String title,int publicationYear){
        super(title,publicationYear);
        this.name = name;
        this.bio = bio;
    }

    //Method to display the data
    public void displayInfo(){
        System.out.println("The title of the Book : "+title);
        System.out.println("The Publication Year of the Book : "+publicationYear);
        System.out.println("The Name of the Author of the Book : "+name);
        System.out.println("The Bio of the Author is : "+bio);    }

}


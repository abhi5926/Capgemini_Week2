// Person class
class Person {
    // Instance variables
    private String name;
    private int age;
    private String address;

    // Constructor to initialize Person object with name, age, and address
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Copy constructor to clone another Person object
    public Person(Person otherPerson) {
        this.name = otherPerson.name;  
        this.age = otherPerson.age;    
        this.address = otherPerson.address;  
    }

    // Method to display Person details
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    // Main method to test the copy constructor
    public static void main(String[] args) {
        // Create a Person object
        Person person1 = new Person("John Doe", 30, "123 Main St");

        // Create a new Person object using the copy constructor (clone person1)
        Person person2 = new Person(person1);

        // Display details of both person1 and person2
        System.out.println("Details of person1:");
        person1.displayPersonDetails();

        System.out.println("\nDetails of person2 (cloned from person1):");
        person2.displayPersonDetails();
    }
}

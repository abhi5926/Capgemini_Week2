package inheritance.singleinheritance.liberarymanagementbookandauthor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Creating object of the class
        Book ob =new Book("Learn Java",2012);
        // Creating anothe class Object
        Author ob1 =new Author("Games Gosling","Father of Java","Learn Java",2012);
        // Calling Method
        ob1.displayInfo();
    }
}

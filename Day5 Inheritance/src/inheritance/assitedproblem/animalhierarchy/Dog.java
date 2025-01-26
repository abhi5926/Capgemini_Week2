package inheritance.assitedproblem.animalhierarchy;

class Dog extends Animal {
    // creating constriuctor
    public Dog(String name , int age){
        super(name,age);
    }
    //Method to print details
    public void printDetail(){
        System.out.println("Name " +name);
        System.out.println("age " +age);
    }
    // To display sound method

    public void makeSound(){
        System.out.println("Dog Sound is Bho Bho :");
    }
}
package inheritance.assitedproblem.animalhierarchy;

class Bird extends Animal {
    // creating constriuctor
    public Bird(String name , int age){
        super(name,age);
    }
    //Method to print details
    public void printDetail(){
        System.out.println("Name " +name);
        System.out.println("age " +age);
    }
    // To display sound method

    public void makeSound(){
        System.out.println("Bird Sound is Chirps Chirps :");
    }
}


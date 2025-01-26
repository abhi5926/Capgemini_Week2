package inheritance.assitedproblem.animalhierarchy;
class Animal {
    //Creating Attributes
    String name;
    int age;

    // Parameterized Constructor
    public Animal(String name ,int age){
        this.name = name;
        this.age = age;
    }
    //Method to print details
    public void printDetail(){
        System.out.println("Name " +name);
        System.out.println("age " +age);
    }
    // To display sound method

    public void makeSound(){
        System.out.println("Animal Sound :");
    }
}


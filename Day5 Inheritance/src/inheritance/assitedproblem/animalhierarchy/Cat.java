package inheritance.assitedproblem.animalhierarchy;


class Cat extends Animal {
    // creating constriuctor
    public Cat(String name , int age){
        super(name,age);
    }
    //Method to print details
    public void printDetail(){
        System.out.println("Name " +name);
        System.out.println("age " +age);
    }
    // To display sound method

    public void makeSound(){
        System.out.println("Cat Sound is Miyao Miyao :");
    }
}

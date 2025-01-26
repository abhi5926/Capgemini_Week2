package inheritance.assitedproblem.animalhierarchy;

class AnimalHierarchy {
    public static void main(String[] args){
        // Creating object of Animal class
        Animal animal = new Animal("animal",10);
        // Mehod calling
        animal.printDetail();
        animal.makeSound();

        // creating object of Dog class
        Dog dog = new Dog("Dog",12);
        // Mehod calling
        dog.printDetail();
        dog.makeSound();

        // creating object of Cat class
        Cat cat = new Cat("Cat",12);
        // Mehod calling
        cat.printDetail();
        cat.makeSound();
        // creating object of Bird class
        Bird bird = new Bird("robins",4);
        // Mehod calling
        bird.printDetail();
        bird.makeSound();
    }
}

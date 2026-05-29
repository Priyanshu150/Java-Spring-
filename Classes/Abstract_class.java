import java.util.*

// Abstraction 
// Shows only important features to user and hide implementation 
// 2 ways to achieve implementation:
// - Class is declared abstract through keyword "abstract"
// - it can hava abstract(method without body) or non abstract method 
// - we cannot create an instance of these classes 
// - we parent has some feature which all child classes have in common, then this can be used 
// - Constructor can be created inside them with super keyword from child class  we can access them 

// Level 1 - Abstract class with abstract methods
public abstract class Animal {

    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract methods - no body, must be implemented by subclass
    public abstract void makeSound();
    public abstract String getType();

    // Concrete method - fully implemented
    public void breathe() {
        System.out.println(name + " is breathing...");
    }

    public String getName() { return name; }
    public int getAge()     { return age; }
}

// Level 2 - Extends Animal BUT still abstract
// Implements some methods, but declares a NEW abstract method
public abstract class Pet extends Animal {

    private String ownerName;

    public Pet(String name, int age, String ownerName) {
        super(name, age);           // calling Animal constructor
        this.ownerName = ownerName;
    }

    // Implements Animal's abstract method
    @Override
    public String getType() {
        return "Pet";
    }

    // Declares a NEW abstract method
    public abstract void play();    // subclass must implement this

    // Concrete method
    public void showOwner() {
        System.out.println(getName() + "'s owner is: " + ownerName);
    }
}

// Level 3 - Concrete class, MUST implement all remaining abstract methods:
// 1. makeSound()  (from Animal)
// 2. play()       (from Pet)
public class Dog extends Pet {

    private String breed;

    public Dog(String name, int age, String ownerName, String breed) {
        super(name, age, ownerName);    // calling Pet constructor
        this.breed = breed;
    }

    // Implementing Animal's abstract method
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof! Woof!");
    }

    // Implementing Pet's abstract method
    @Override
    public void play() {
        System.out.println(getName() + " is fetching the ball!");
    }

    public void showBreed() {
        System.out.println(getName() + " is a " + breed);
    }
}


// Main - Running everything
public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Bruno", 3, "Rahul", "Labrador");

        dog.makeSound();    // Bruno says: Woof! Woof!
        dog.play();         // Bruno is fetching the ball!
        dog.breathe();      // Bruno is breathing...
        dog.showOwner();    // Bruno's owner is: Rahul
        dog.showBreed();    // Bruno is a Labrador

        System.out.println(dog.getType());  // Pet
        System.out.println(dog.getAge());   // 3
    }
}
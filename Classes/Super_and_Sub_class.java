import java.util.*

// A class is derived from another class is called sub-class
// And from class through which subclass is derived its call super-class 
// In java, in absense of any other explicit superclass, every class is implicitly a sub class of Object class
// Object is the topmost class in java 
// It has some common method like clone(), toString(), equal(), notify(), wait()... etc 


// Superclass
public class Vehicle {

    private String brand;
    private int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void move() {
        System.out.println(brand + " is moving at " + speed + " km/h");
    }

    public void fuel() {
        System.out.println(brand + " is consuming fuel...");
    }

    public String getBrand() { return brand; }
    public int getSpeed()    { return speed; }
}

// Subclass
public class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);            // calling Vehicle constructor
        this.numberOfDoors = numberOfDoors;
    }

    // Overriding parent method
    @Override
    public void move() {
        System.out.println(getBrand() + " Car is driving at " + getSpeed() + " km/h");
    }

    // Child specific method
    public void openTrunk() {
        System.out.println(getBrand() + " trunk is opening...");
    }
}

public class Main {
    public static void main(String[] args) {

        // ✅ Parent reference holding Child object (Upcasting)
        Vehicle vehicle = new Car("Toyota", 120, 4);

        // Calls Child's overridden method (Runtime Polymorphism)
        vehicle.move();     // Toyota Car is driving at 120 km/h

        // Calls Parent's method
        vehicle.fuel();     // Toyota is consuming fuel...

        // ❌ Cannot access child-specific method directly
        // vehicle.openTrunk();  // COMPILE ERROR

        // ✅ Downcast to access child-specific method
        Car car = (Car) vehicle;
        car.openTrunk();    // Toyota trunk is opening...


        System.out.println("--- Storing multiple child objects in Parent reference ---");

        // Very useful in arrays/lists
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("Honda", 100, 4);
        vehicles[1] = new Car("BMW", 200, 2);
        vehicles[2] = new Car("Audi", 180, 4);

        for (Vehicle v : vehicles) {
            v.move();   // calls each Car's overridden move()
        }
    }
}

// Output 
Toyota Car is driving at 120 km/h
Toyota is consuming fuel...
Toyota trunk is opening...
--- Storing multiple child objects in Parent reference ---
Honda Car is driving at 100 km/h
BMW Car is driving at 200 km/h
Audi Car is driving at 180 km/h
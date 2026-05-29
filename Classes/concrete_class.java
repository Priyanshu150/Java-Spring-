import java.util.*


// Concrete Class
// These are those classes that we can create an instance using NEW keyword 
// All the method in this class have implementation 
// A class access modifier can be "public" or "package private" (no explicit modifier defined)


public class Car {
    
    // Fields
    private String brand;
    private String model;
    private int year;
    
    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    // Fully implemented methods
    public void start() {
        System.out.println(brand + " " + model + " is starting...");
    }
    
    public void stop() {
        System.out.println(brand + " " + model + " is stopping...");
    }
    
    public String getDetails() {
        return year + " " + brand + " " + model;
    }
}

// Main class - Creating objects (instantiation)
public class Main {
    public static void main(String[] args) {
        
        Car car1 = new Car("Toyota", "Camry", 2023);
        Car car2 = new Car("Honda", "Civic", 2022);
        
        car1.start();               // Toyota Camry is starting...
        System.out.println(car1.getDetails()); // 2023 Toyota Camry
        
        car2.start();               // Honda Civic is starting...
        car2.stop();                // Honda Civic is stopping...
    }
}
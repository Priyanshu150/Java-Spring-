import java.util.*

/*
 What are interfaces ?
    Interfaces is something which helps 2 system to interact with each other, without one system has to know details of other

    Or simple terms it helps to achieve ABSTRACTION
*/

// Only public and default modifier is allowed (protectd and private are not allowed)
public interface Bird{
    public void fly();
}

interface Bird{
    public void fly();
}


// Comma separated list of parent interfaces (it can not extend from class) Example:

public interface NonFlyingBirds extends Bird, LivingThings{
    public void canRun();
}

/* Why do we need interfaces ?? 
    1. Abstraction 
    2. Polymorphishm
    3. Multiple Inheritance 
*/

// 1. Abstraction - Using interface, we can achieve full abstraction means, we can define WHAT class must do, but not 

public interface Bird{
    public void fly();
}

public class Eagle implements Bird{
    @Override
    public void fly(){
        // eagle fying method 
    };
}

/* 2. Polymorphishm
    Interface can be use as a data type 

    We can not create the object of an interface, but it can hold the reference of all the classes which implements it.
    And at runtime, it decide which methods need to be invoked 
*/

public interface Bird{
    public void fly();
}

public class Eagle implements Bird{
    @Override
    public void fly(){
        // eagle fying method 
    };
}

public class Hen implements Bird{
    @Override
    public void fly(){
        // eagle fying method 
    };
}


// 3. Multiple Inheritance - In java, it possible with help of interfaces only 

public interface WaterAnimal{
    public boolean canBreathe();
}

public interface LandAnimal{
    public boolean canBreathe();
}

public class Crocodile implements WaterAnimal, LandAnimal{
    // implentation of methods 
}

/* Method in Inteface:
    - All method are implicit public only 
    - Method cannot be declared as final 
*/ 

public interface Bird{
    // both are public method only 

    public void fly();

    void hasBeak();
}


/* Fields in Inteface:
    - Fields are public, static and final implicitly (CONSTANTS)
    - You cannot make field private or protected 
*/ 

public interface ANIMAL{
    // both are the same as they're constant 

    int MAX_HEIGHT = 100;
    public static final int MAX_HEIGHT_IN_FEET = 1000;
}

/*
  Interface Implementation:
    - Overridding method can not have more restricted access specifier 
        i.e public can not be changed to private / protected in any of the class / interface which is implementing it 
    
    - Concrete class must override all the method declaration in interface 
    - Abstract class are not forced to override all the mehtods 

*/
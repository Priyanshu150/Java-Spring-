import java.util.*;

/* Default method in interface 
    why need ? So to not re-write the implementation of a function in all class which implements it 
*/ 

public interface Bird{
    public void canFly();

    default int getMinimumFlyingHeight(){
        return 100;
    }
}

/*
    Why default method was introduced 
     - To add the functionality in existing legacy we need to use default method. 
     - Example stream() mehtod in collection 
*/ 

// Default and multiple Inheritance, How to handle: 

public interface Bird{
    default boolean canBreath(){
        return true;
    }
}

public interface LandAnimal{
    default boolean canBreath(){
        return true;
    }
}

// this declaration become wrong, we've to provide of implementation of default method 
public class Eagle implements Bird, LandAnimal{
    
}

public class Eagle implements Bird, LandAnimal{

    default boolean canBreath(){
        return true;
    }
}

/*
    Static method : 
     - We can provide the implementation of the method in interface     
     - But it can not be overridden by classes which implements this interface 
     - We can access it by interface name itself 
     - it's default by public
*/

public interface Bird{
    static boolean canBreathe(){
        return true;
    }
}

public class Eagle implements Bird{
    public void digestiveSystemTestMethod(){
        if(Bird.canBreathe()){
            // do something 
        }
    }
}

/*
    Private method and Private static method (java 9) :

    - We can provide the implementation of method but as private access modifier in interface 
    - It brings more readability to the code. for example if multiple default method same code, that 
    - It can be defined as static and non-static
    - From static method, we can call only private static interface method 
    - Private static method, can be called from both static and non staic method
    - Private interface method can not be abstract. Means we've to provide the definition
    - It can be used inside of the particular interface only 
*/ 

public interface Bird{
    void canFly();  // this is equivalent to public void canFly()

    // java 8 feature 
    public default void minimumFlyingHeight(){
        myStaticPublicMethod();         // calling static method 
        myPrivateMethod();              // calling private method 
        myPrivateStaticMethod();        // calling private static method 
    }

    // java 8 feature 
    static void myStaticPublicMethod(){
            ();    // from static we can call other static method only 
    }

    // java 9 feature 
    private void myPrivateMethod(){
        // private method implementation 
    }

    // java 9 feature 
    private static void myPrivateStaticMethod(){
        // private static method implementation 
    }
}
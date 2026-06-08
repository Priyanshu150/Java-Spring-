import java.util.*

/*
    Functional Interface
    - If an interface contains only 1 abstract method, that is functional interface 
    - Also known as SAM (Single abstract method)
    - @FunctionalInterface keyword can be used but it's optional 
*/

@FunctionalInterface 
public interface Bird{
    void canFly(String val);
}
// or 
public interface Bird{
    void canFly(String val);
}

// @FunctionalInterface  annotation restrict us and throws the compilation error, if we try to add more than 1 abstract method

@FunctionalInterface
public interface Bird{
    void canFly(String val);

    default void getHeight(){
        // default method implementation 
    }

    static void canEat(){
        // my static method implementation 
    }

    String toString();      // Object class method 
}

// above code is correct as it has only 1 abstract method 


// 3 ways to implement Functional interface 

@FunctionalInterface 
public interface Bird{
    void canFly(String val);
}

// 1. Via implements keyword 
class Eagle implements Bird{
    void canFly(String val){
        // do something 
    }
}

// using anonymous class 

public class Main(){
    public static void main(String[] args) {
        // 2. using anonymous class 
        Bird eagleObj = new Bird(){
            @Override 
            public void canFly(String value){
                // do something 
            }
        }
        eagleObj.canFly("horizontal");

        // 3. using lambda expression 
        Bird eagleObject = (String value) -> {
            System.out.println("Eagle Bird Implementation");
        };

        eagleObject.canFly("vertical");
    }
}

// Types of functinal interface which is present in the package java.util.function;

// 1. Consumer  - Represent an operation that access single input parameter and return no result

@FunctionalInterface
public interface Consumer<T>{
    void accept(T t);
}


// 2. Supplier - Represent the supplier of the result. Accept no input parameter but produces a result 

@FunctionalInterface
public interface Supplier<T>{
    T get();
}


// 3. Functional - that accepts one argument process it and produces a result 

@FunctionalInterface
public interface Function<T, R>{
    R test(T t);
}


// 4. Predicate - Represent function, that expcept one parameter and return boolean value 

@FunctionalInterface
public interface Predicate<T>{
    boolean test(T t);
}

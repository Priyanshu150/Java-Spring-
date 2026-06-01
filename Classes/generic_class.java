import java.util.*

public class Print{
    Object value;

    public void setPrintValue(Object value){
        this.value = value;
    }

    public Object getPrintValue(){
        return value;
    }
}

public class Main{
    public static void main(String[] args) {
        Print printObj = new Print();
        printObj.setPrintValue(1);  // Integer 
        Object printValue = printObj.getPrintValue();
        // we cannot use printValue directly, we've to typecase it else it will give compile time error 
        if((int)printValue == 1){
            // do something 
        }
    }
}

// Problem :- Object is parent of every class, hence we've to type casting for every value passed to above funtion 

public class Print<T> {
    T value;

    public void setPrintValue(T value){
        this.value = value;
    }

    public T getPrintValue(){
        return value;
    }
}

public class Main{
    public static void main(String[] args) {
        Print<Integer> printObj = new Print<Integer>();
        // Print<Integer> printObj = new Print<>();
        printObj.setPrintValue(1);  // Integer 
        Integer printValue = printObj.getPrintValue();
        // we cannot use printValue directly, we've to typecase it else it will give compile time error 
        if((int)printValue == 1){
            // do something 
        }
    }
}

public class Pair<K,V> {
    private K key;
    private V value;

    public void put (K key, V value){
        this.key = key;
        this.value = value;
    }
}

public class Main{
    public static void main(String[] args) {
        Pair<String, Integer> pairObj = new Pair<>();
        pairObj.put("hello", 123);
    }
}

// Generic method 
// What if we only want to make method generic, not the complete class, we can write generic method too 
// Type parameter should be before the return type of the method declaration
// Type parameter scope is limited to method only 

public class GenericMethod{
    public <K,V> void printValue(Pair<K,V> pair1, Pair<K,V> pair2){
        // do something
    }
}

// Raw type: It's a name of the generic class or interface without any type argument 

public class Main{
    public static void main(String[] args) {
        // by defaul Object will be passed if nothing is defined 
        Print parameterizedPrintObj = new Print();
        parameterizedPrintObj.setPrintValue(1);
        parameterizedPrintObj.setPrintValue("Hello");
    }
}

// Multi Bound: 
// <T extends superclass & interface1 & interface N>
// - The first restrictive type should be concrete class 
// - 2,3 onwards can be anything concrete class, abstract class, interfaces 

public class A extends parentClass implements Interface1, Interface2{

}

public class Print<T extends parentClass & Interface1 & Interface2{
    T value;
    
    public T getPrintValue(){
        return value;
    }

    public void setPrintValue(T value){
        this.value = value;
    }
}
import java.util.*

/*
    What is reflection ?
    - This is used to examine the classes, methods, fields, interface at runtime and also possile to change the behavior too
    example : 
        What all method are present in the class ? 
        what all fields are present in the class ? 
        What is the return type of the method .
        What is modifier of the class 
        What all interface class has implemented 
        Change the value of the public and private fields of the class etc....
*/

/*
    How to do reflection of classes ? 
     - To reflect the class, we first need to get object of the Class 
        (So let's first understand, class then we will come back to how to reflect the class)

        What is this class Class ? 
         - Instance of the class Class represent classes during runtime
         - JVM creates one Class object for each and every class which loaded during runtime
         - This class object, has meta deta information about the particular class like its methods, fields and constructor etc.

*/


// How to get particular class Class object ?

// 1. Using forName() method 

class Bird{}

// get the object of the Class for getting the metadata information of Bird class.
Class birdClass = Class.forname("Bird");


// 2. Using .class 
class Bird{}

// get the object of the Class for getting the metadata information of Bird class.
Class birdClass = Bird.class;


// 3. Using getClass() method 
class Bird{}

// get the object of the class for getting the metadata information of Bird class.
Class birdClass = birdClass.getClass();


//  Reflection of Classes: 

public class Eagle{
    public String breed;
    private boolean canSwim;

    public void fly(){
        System.out.println("Fly");
    }

    public void eat(){
        System.out.println("eat");
    }
}

public class Main{
    public static void main(String[] args) {
        Class eagleClass = Eagle.class;

        System.out.println(eagleClass.getName());
        System.out.println(Modifier.toString(eagleClass.getModifiers()));
    }
}

// Under Class we get a lot of method which can be use to manipulate the feilds, constructor, methods etc of an class 

/* Dis-advantage of reflection :- 
    - It breaks the singleton class rule hence it's not preferrable 
    - It slow as it's performed during runtime 
*/

public class Eagle{
    private Eagle(){
        // private constructor 
    }

    public void fly(){
        System.out.println('Fly');
    }
}

public class Main{
    public static void main(String args[]) throws InvocationTargetException, InstantiationException, IllegalAccessException{
        Class eagleClass = Eagle.class;
        // to access the private constructor too.
        Constructor[] eagleConstructorList = eagleClass.getDeclaredConstructor();

        for(Constructor eagleConstructor : eagleConstructorList){
            System.out.println("Modifier: " + Modifier.toString(eagleConstructor.getModifiers()));

            eagleConstructor.setAccessible(true);
            Eagle eagleObj = (Eagle) eagleConstructor.newInstance();
            eagleObject.fly();
        }
    }
}
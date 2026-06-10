import java.util.*


/*  
    What is Annotation ? 
    - It is kind of adding META DATA to java code 
    - Means, its usage is OPTIMAL 
    - We can use this metadata information at runtime and can add certain logic in code if wanted 
    - How to read meta data information ? Using Reflection 
    - Annotation can be applied at anywhere like Class, Methods, Interface, field, interface etc 

*/

public interface Bird{
    public void fly();
}


public class Eagle implements  Bird{
    @Overrider              // annotation denoted using @
    public void fly(){
        return true;
    };
}


/*
    Type of annotation :- 
        1. Pre-defined 
            1.1. Used on Annotation (called meta-annotation)
            1.2. Used on Java Code (like classes, methods etc )
        
        2. Custom annotation / User Defined annotation 
*/

/* Custom annotation / User Defined annotation 
        @{Our custome name}
        
        We can create our OWN ANNOTATION using keyword '@inteface'

*/

// Creating Annotation 

public @interface MyCustomAnnotation{

}

@MyCustomAnnotation
public class Eagle{
    public void fly(){

    }
}


/* Create the annotation with method (its more like a field)
    - No parameter, no body 
    - Return type is restricted to primitive, class, String, enum, annotation and array of these types 
*/

public @interface MyCustomAnnotation{
    String name() default 'hello';      // this is used to pass default value 
}

@MyCustomAnnotation(name = 'testing')
public class Eagle{
    public void fly(){

    }
}
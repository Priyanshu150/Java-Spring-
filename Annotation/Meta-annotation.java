import java.util.*


/*
    @Deprecated:
        - Usage of Deprecated class or method or field, shows you compile time WARNING
        - Deprecation means, no further improvement is happening on this and new alternative method or field instead
        - Can be used over: Constructor, Field, Local variable, method, package, parameter, type(class, interface, enum)
*/ 

public class Mobile{
    @Deprecated
    public void dummyMethod(){
        // do something 
    }
}


/*
    @Override
        - During compile time, it will check that the method should be overridden
        - And throws compile time error, if it does not match with parent method
        - Can be use over: METHODS 
*/ 

public interface Bird{
    public boolean fly();
}

public class Eagle implements Bird{
    @override
    public boolean fly(){
        return true;
    }
}

/*
    @SupressWarning: 
        - It will tell compiler to ignore any compile time warning 
        - Use it safely, could led to run time exception if any valid warning is IGNORED
        - Can be used for: Field, methods, paramter, constructor, local variable, type(class or interface or enum)
*/

public class Main{
    @SupperssWarning("deprecation")
    public static void main(String args[]){
        Mobile mobileObj = new Mobile();
        mobileObj.dummyMethod();
    }
}

/*
    @FunctionalInterface:
        - Restrict interace to have only 1 abstract method 
        - Throws compile error, if more than 1 abstract method found 
        - Can be used over: type(Class or interface or enum )
*/ 

@FunctionalInterface 
public interface Bird{
    public boolean fly();
    public void eat();
}

// throws an error as 2 abstract method are present 

/* 
    @SafeVarargs:
        - Used to supress 'Heap pollution warning'
        - Used over method and constructor which have variable argument as parameter 
        - Method should be either static or final (i.e. method which can not be overriden)
        - In java9, we can also use it for private methods too 
    
    What is heap pollution ? 
     - Object of one type (Example : String), storing a reference of another object type (such as interger, double)
*/ 

public class Log{
    @SafeVarargs
    public static void printLogValues(List<Integer>... logNumberList){
        Object[] objList = logNumberList;

        List<String> stringValueList = new ArrayList<>();
        stringValueList.add('Hello');
        objList[0] = stringValueList;
    }
}
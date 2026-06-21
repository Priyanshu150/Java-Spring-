import java.util.*


// Un-checked / Runtime Exception:
// These are the exception that occurs during runtime and compiler not forcing us to handle them 

public class Main{
    public static void main(String[] args) {
        Object val = 0;
        // ClassCastException:
        System.out.println((String)val);

        // Arthimetic Excpetion 
        int val = 5/0;
        method1();

        // NullPointerException 
        String value = null;
        System.out.println(value.charAt(0));
    }

    private void method1() throws ArithmeticException{
        throw new ArithmeticException();
    }
}


/*
    Checked / Compile time Exception:
    Compiler verifies them during the complie time of the code and if not handled properly, code compilation will fail 
*/ 

public class Main{

    // throws tells that, this method might or might not throw this expcetion, my caller pls handle it 
    private void method1() throws ClassNotFoundException{
        throw new ClassNotFoundException();
    }

    // handles the exceptions 
    private void method2(){
        try {
            throw new ClassNotFoundException();
        } catch (ClassNotFoundExceptionObj exceptionObj) {
            // perform some task 
        }
    }

    public static void main(String[] args) {
        // parent handles the exception or can ask it's caller to handle it 
        try {
            method1();  // 1st way 
        } catch (Exception e) {
            // Exception is parent of all the exception object 
        }

        method2();  // another way 

        // Different way to use try catch block 

        // 1. multiple catch blocks 
        try {
            method1();
        } catch (ClassNotFoundException e) {

        } catch (InterruptedException e){

        } catch (FileNotFoundException e){

        }

        // 2. using exception obj 
        try {
            method1();
        } catch (ClassNotFoundException e) {

        } catch (Exception e){

        } 
        // no need to declare as expcetion already handles it 
        catch (FileNotFoundException e){

        }

        // 3. mutliple exception in same catch block 
        try {
            method1();
        } catch (ClassNotFoundException | InterruptedException e) {

        }
    }
}


// try - catch - finally 

public class Main{
    public static void main(String[] args) {
        try {
            // throw an error
        } finally {
            // in every case finally blocks gets executed 
            System.out.println("Finally block gets executed");
        }
    }
}


// Creating / Custom user-defined exception class 

public class MyExceptionClass extends Exception {
    MyExceptionClass(String message){
        super(message);
    }
};

public class Main{
    public static void main(String[] args) {
        try {
            // thorws an exception 
        } catch (MyExceptionClass e) {
            // handle it 
        }
    }
}
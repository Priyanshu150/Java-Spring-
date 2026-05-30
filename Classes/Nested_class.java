import java.util.*

// Nested Class :- Class within another class is called Nested Class 

// When to use ?
// If you know that, a class(A) will be used only one another class(B), then instead of created new (A.java) for it,
// we can create nested class inside class B iteself and also help us to group logically related class 

// Scope : It's scope is same as outer class 
// Inheritance is possible in the nested class 

// It is of 2 types:
// Static Nested class
// Non - static nested class 
//   - Member Inner class
//   - Local Inner class 
//   - Anonymous Inner Class 

class outerClass{
    int instanceVariable = 10;
    static int classVariable = 20;

    static class nestedClass{
        public void print(){
            // instanceVariable cannot be accessible inside static nested class 
            System.out.println(classVariable);
        }
    }
}

public class ObjectTest{
    public static void main(String args[]){
        outerClass.nestedClass nestedObj = new outerClass.nestedClass();
        nestedObj.print();
    }
}


// Static nested class 
// - It do not have access to the non static instance variable and method of outer class 
// - It's object can be initiated without initiating the object of outer class 
// - It can be private, protected, public, package-private (defaul, no explicit declaration)

// Inner class or non static nested class:
// - It has access to all the instance variable and method of the outer class 
// - Its object can be initiated on after initiating the object of outer class 

// 1. Member Inner Class: 
// -its can be private, public, protected default 

class outerClass{
    int instanceVariable = 10;
    int classVariable = 20;

    class InnerClass{
        public void print(){
            System.out.println(classVariable + instanceVariable);
        }
    }
}

public class ObjectTest{
    public static void main(String[] args) {
        outerClass outerClassObj = new outerClass();
        outerClassObj.InnerClass innerClassObj = new outerClassObj.InnerClass();
        innerClassObj.print();
    }
}

// 2. Local Inner Class:
// - These are those classed which are defined in any block like for loop, while loop, if condition block, method etc
// - It can not be declared as private, protected, public. Only default (not defined explicit) access modifier 
// - It cannot be initiated inside the block 

class outerClass{
    int instanceVariable = 10;
    static int classVariable = 20;

    public void display(){
        int methodLocalVariable = 3;

        class LocalInnerClass{
            int localInnerVariable = 10;

            public void print(){
                System.out.println(instanceVariable + classVariable + methodLocalVariable + localInnerVariable);
            }
        }
        LocalInnerClass localObj = new LocalInnerClass();
        localObj.print();
    }
}

public class  ObjectTest{
    public static void main(String[] args) {
        outerClass outerClassObj = new outerClass();
        outerClassObj.display();
    }
}

// 3. Anonymous Inner Class:
// An inner class without a name called Anonymous class 
// Why it's used:
// - When we want to override the behavious of method without creating any subclass 

public abstract class Car{
    public abstract void pressBreak();
}

public class Test{
    public static void main(String[] args) {
        Car audiCarObj = new Car(){

            @Override 
            public void pressBreak(){
                // audi specific break implementation 
                System.out.println("Applying break for Audi Car ");
            }
        };

        audiCarObj.pressBreak();
    }
}


// 2 things happened behind the scenes:
// - Sub class is created, name decided by compiler 
// - Create an object of subclass and assign its reference to object 'audiCarObj'
// Similarly for interface it also works in same ways 
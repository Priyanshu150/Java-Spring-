import java.util.*

// ENUM Class
// It has collection of CONSTANTS (variable which values can not be changed)
// It's CONSTANTS are static and final implicitly (we do not have to write it )
// It can not extend any class, as it internally extends java.lang.ENUM class 
// It can implement interfaces 
// It can have variables, methods, constructor 
// It can not be initiated(as the constructor will be private only, even if you give default in byte code it will make it private)
// No other classes can extend ENUM class
// It can have abstract method and all the constant should implement that abstract methods 


// Normal Enum class: 

public enum EnumSample{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY, 
    SUNDAY;
}

public class Main{
    public static void main(String[] args) {
        /* Common function which is used 
            values() - Use to iterate over the constant 
            ordinal() - to know the default value 
            valueOf() - pass string, find the enum value 
            name() - returns the name of constant 
        */

        // usage of values() and ordinal()
        for(EnumSample sample: EnumSample.values()){
            System.out.println(sample.ordinal());
        }

        // uses of valueOf() and name()
        EnumSample enumVariable = EnumSample.valueOf("FRIDAY");
        System.out.println(enumVariable.name());
    }
}

/*
    OUTPUT :
        0 
        1 
        2
        3
        4
        5
        6
        FRIDAY
*/

// ENUM with custom values

public enum EnumSample2{
    MONDAY(101, "First Day of the week"),
    TUESDAY(102, "Second Day of the week"),
    WEDNESDAY(103, "Third Day of the week"),
    THURSDAY(104, "Fouth Day of the week"),
    FRIDAY(105, "Fifth Day of the week"),
    SATURDAY(106, "Sixth Day of the week"),
    SUNDAY(107, "Seventh Day of the week");

    public int value;
    private  String comment;

    EnumSample2(int value, String comment){
        this.value = value;
        this.comment = comment;
    }

    public int getVal(){
        return value;
    }

    public static EnumSample2 getEnumFromValue(int value){
        for(EnumSample2 sample: EnumSample2.values()){
            if(sample.value == value)
                return sample ;
        }

        return null;
    }
}

public class Main{
    public static void main(String[] args) {
        EnumSample2 sampleVar = EnumSample2.getEnumFromValue(107);
        System.out.println(sampleVar.getComment());
    }
}


// Method Overide by constanct 

public enum EnumSample3{
    MONDAY{
        @Override
        public void dummyMethod(){
            System.out.println("Monday dummy method");
        }
    },
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY, 
    SUNDAY;

    public void dummyMethod(){
        System.out.println("default dummy method");
    }
}

public class main{
    public static void main(String[] args) {
        EnumSample3 fridayEnumSample = EnumSample3.FRIDAY;
        fridayEnumSample.dummyMethod();

        EnumSample3 mondayEnumSample = EnumSample3.MONDAY;
        fridayEnumSample.dummyMethod();
    }
}

/* OUTPUT 
    default dummy method 
    Monday dummy method
*/

// ENUM with abstract method 

public enum EnumSample4{
    MONDAY{
        public void dummyMethod(){
            System.out.println("Monday dummy method");
        }
    },
    TUESDAY{
        public void dummyMethod(){
            System.out.println("Tuesday dummy method");
        }
    },
    SUNDAY{
        public void dummyMethod(){
            System.out.println("Sunday dummy method");
        }
    };

    public abstract void dummyMethod();
}


// ENUM implements interface 

public interface MyInterface(){
    public String toLowerCase();
}

public enum EnumSample5 implements MyInterface{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    @Override
    public String toLowerCase(){
        return this.name().toLowerCase();
    }
}

/* Why do we need ENUM if final static final to make constant ?? 
=> more readability 
=> control over the code/input 

*/
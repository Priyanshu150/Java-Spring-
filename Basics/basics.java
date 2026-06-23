import java.util.*


// Instacneof operation 

public class ParentClass{

}

public class ChildClass1 extends ParentClass{

}

public class ChildClass2 extends ParentClass{
    
}

public class Main{
    public static void main(String[] args) {
        ParentClass obj = new ChildClass2();
        // instacneof used to find the reference from parent 
        System.out.println(obj instanceof ChildClass1);
        System.out.println(obj instanceof ChildClass2);
    }
}

// switch expression 

public class Main{
    public static void main(String[] args) {
        int val = 1;
        // -> and yeild uses
        Stirng outputVal =  swith(val){
            case 1 -> "One";
            case 2 -> {
                yield "Two";
            }
            default -> "none";
        };
        System.out.println(outputVal);
    }
}


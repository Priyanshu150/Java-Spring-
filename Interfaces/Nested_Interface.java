import java.util.*;

/* Nested Interface :
    - Nested interface declared within another interface 
    - Nested interface declared within another class

    Generally its is used to group, logical related interfaces. And Nested Interface 

    Rules: 
     - A nested interface declared within an interface must be public 
     - A nested interface declared inside a class can have any access modifier 
     - When you implement outer interface, inner interface implementation is not required and vice-versa
*/ 

// Interface inside Interface 

public interface Bird{
    public void canFly();

    public interface NonFlyingBirds{
        public void canRun();
    }
}

// way to implement it 

public class Eagle implements Bird{
    @Override
    public void canFly(){
        // Implementation 
    }
}

public class Eagle implements Bird.NonFlyingBirds{
    @Override
    public void canRun(){
        // Implementation 
    }
}

public class Eagle implements Bird, Bird.NonFlyingBirds{
    @Override
    public void canFly(){
        // Implementation 
    }

    @Override
    public void canRun(){
        // Implementation 
    }
}

// Interface inside a class 

public class Bird{

    protected interface NonFlyingBirds{
        public void canRun();
    }
}

public class Eagle implements Bird.NonFlyingBirds{
    @Override
    public void canRun(){

    }
}
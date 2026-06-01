import java.util.*;

// POJO class :- 
// Stands for "Plain old java object"
// Class should be public 
// Public default constructor
// No annotation should be used like @Table, @Entit, @Id etc
// It should not extend any class or implement any interface 

// Where do we use this ??
// Generally for converting data in standard format which is coming from the outside source 

public class Student{
    int name;
    private int rollNumber;
    protected String address;

    public int getName(){
        return name;
    }

    public void setName(int name){
        this.name = name;
    }

    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }

    public int getrollNumber(){
        return rollNumber;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }
}
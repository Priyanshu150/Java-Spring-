import java.util.*

/* Immutable class:
    We don't change the value of the object once created 
    Declare class as 'final' so that it can not be extended 
    All class member should be private. So that direct access can be avoided 
    And class member are initialized only using constructor 
    They should not be any getter / setter method, which are generally use to change the values 
    Just getter method and return copy of member variable 
    Example: String, Wrapper classes etc
*/

final class MyImmutableClass{
    private final String name;
    private final List<Object> petNameList;

    MyImmutableClass(String name, List<Object> petNameList){
        this.name = name;
        this.petNameList = petNameList;
    }

    public String getName(){
        return name;
    }

    public List<Object> getPetNameList(){
        //this is required because list final,
        // means you can not now point it to new list, but still can add, delete values in it 
        // so thats why send the copy of it 
        return new ArrayList<>(petNameList);
    }
}
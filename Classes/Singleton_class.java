import java.util.*

// Singleton class 
// This class objective is to create only 1 class and 1 object 

/* Different ways of creating singleton class 
    1. Eager Initialization 
    2. Lazy Initialization
    3. Synchronization Block
    4. Double check lock (there is memory issue, resolved through volatile instance variable)
    5. Bill Pugh solution 
    6. Enum singleton
*/

// 1. Eager Initialization

public class DBConnection {
    public static DBConnection conObject = new DBConnection();

    private DBConnection(){

    }

    public static DBConnection getInstance(){
        return conObject;
    }
}

// cons :- Even the object is not getting used, it will get created 

// 2. Lazy Initialization

public class DBConnection {
    public static DBConnection conObject;

    private DBConnection(){

    }

    public static DBConnection getInstance(){
        if(conObject == null){
            conObject = new DBConnection();
        }
        return conObject;
    }
}

// Con - In case of multiple thread trying to access it'll create the multiple object 

// 3. Synchronization Block

public class DBConnection {
    public static DBConnection conObject;

    private DBConnection(){

    }

    synchronized public static DBConnection getInstance(){
        if(conObject == null){
            conObject = new DBConnection();
        }
        return conObject;
    }
}

// con - It will make the process slow 


// 4. Double check lock (there is memory issue, resolved through volatile instance variable)

public class DBConnection {
    public static volatile DBConnection conObject;

    private DBConnection(){

    }

    public static DBConnection getInstance(){
        if(conObject == null){
            synchronized (DBConnection.class) {
                if(conObject == null){
                    conObject = new DBConnection();
                }
            }
        }
        return conObject;
    }
}

// Cons - memory issue, each threds updates their respective cache which becomes a problem if cache is not synced with memory
//      the new object can be created twice instead of once. 
//     This solution is also slow 

// volatile - keyword solves this problem as it makes reading / updating directly to the memory 

// 5. Bill Pugh solution 

public class DBConnection {
    private DBConnection(){

    }

    private static class DBConnectionHelper{
        private static final DBConnection INSTANCE_OBJECT = new DBConnection();
    }

    public static DBConnection getInstance(){
        return DBConnectionHelper.INSTANCE_OBJECT;
    }
}


// 6. Enum singleton

enum DBConnection{
    INTSTANCE;
}
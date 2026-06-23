1. What is Java Collection framework ?

- Added in java version 1.2
- Collection is nothing but a group of Object 
- Present in java.util package 
- Framework provide us the architecture to manage these "group of objects" i.e  add , update delete, search etc 

2. Why we need Java Collection Framework ? 
- Prior to JCF, we have Array, Vector, Hash tables.
- But problem with that is, there is no common interface, so its difficult to  remember the methods for each 

Java Collection Framework Hierarchy 

![alt text](images/image.png)

![alt text](images/image-1.png)


3. Iterable 

![alt text](images/image-2.png)

4. Collection: It represent the group of object. Its an interface which provides methods to work on group of objects.

![alt text](images/image-4.png)

Q. If Iterable, collections are interfaces. How can they give the concrete implementation of any method ??
Ans. There 3 ways through which it can be achieved :- 
    - Abstract classes in the middle
        ![alt text](images/image-5.png)

    - Default method in interface (Java 8+)

    - Static methods in Interface (Java 8+)

5. Collection vs Collections 
    *Collection* is part of Java collection framework. And its an interface which expose various methods which is implemented by various collection classes like ArrayList, Stack, LinkedList etc.

    *Collections* is a Utility calss and provide static methods, which are used to operate on collections like sorting, swapping, searching, reverse, copy etc
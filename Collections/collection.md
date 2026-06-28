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

6. Queue
    ![alt text](images/image-6.png)

7. Priority-Queue (minHeap and maxHeap)

8. Comparator v/s Comparable 
    Both provide a way to sort the collection of objects
    ![alt text](images/image-7.png)

9. Deque
    ![alt text](images/image-8.png)

10. Array-Deque: A concrete class implements the methods which are avialble in Queue and deque Interface.

11. Thread safe version of pq and array queue
    ![alt text](images/image-9.png)

12. List: 
    - List is a ordered collection of an objects. In which duplicate values can be stored
    ![alt text](images/image-10.png)
    ![alt text](images/image-11.png)
    ![alt text](images/image-12.png)
    ![alt text](images/image-13.png)

13. LinkedList
    - Implements boths Deque and List interface
    - means it supports deque methods like: getFirst, getLast, removeFirst etc.
    - It supports index based operation like: get(Index), add(index, object) etc.
    ![alt text](images/image-14.png)

14. Vector 
    ![alt text](images/image-15.png)

15. Stack 
    ![alt text](images/image-16.png)
    ![alt text](images/image-17.png)
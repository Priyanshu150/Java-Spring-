import java.util.*;

/*
    add() -> internally calls addLast() method
    offer() -> calls offerLast() method
    poll() ->> calls pollFirst() method
    remove() -> calles removeFirst() method
    peek() -> calls peekFirst() method
    element() -> calls getFirst() method

    Time Complexity : 

    - Insertion: Amortized(most of the time or average) complexity is O(1) expcept few cases like
        O(n): when queue size threshold reached and try to insert an element to end or front, then its 
        O(N) as values are copied to new queue with bigger size
    
    - Deletion: O(1)

    - Search: O(1)

    Space Complexity: O(n)
*/

public classs Main{
    ArrayDeque<Integer> arrDequeAsQueue = new ArrayDeque<>();

    // insertion 
    arrDequeAsQueue.addLast(1);
    arrDequeAsQueue.addLast(5);
    arrDequeAsQueue.addLast(10);

    // deletion 
    int element = arrDequeAsQueue.removeFirst();
    System.out.println(element);

    // LIFO (last in first out)
    ArrayDeque<Integer> arrayDequeAsStack = new ArrayDeque<>();
    
    // insertion 
    arrayDequeAsStack.addFirst(1);
    arrayDequeAsStack.addFirst(5);
    arrayDequeAsStack.addFirst(10);  

    // deletion 
    int removedElem = arrayDequeAsStack.removeFirst();
    System.out.println(removedElem);
}
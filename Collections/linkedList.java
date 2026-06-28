import java.util.*

/*
    Time complexity:: 
    - Insertion at start and end: O(1)
    - Insertion at particular index: O(N) for lookup and index + O(1) for adding
    - Serach: O(n)
    - Deletion at start or end: O(1)
    - Deletion at specific index: O(n) for the lookup of the index + O(1) for removal

    Space complexity: O(n)
*/
public class LinkedListExample{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        //using deque functionality 
        list.addLast(200);
        list.addLast(300);
        list.addLast(400);
        list.addLast(100);
        list.addLast(500);
        System.err.println(list.getFirst());

        // using list functionality 
        LinkedList<Integer> list2 = new LinkedList<>();

        list2.add(0,100);
        list2.add(1,300);
        list2.add(2,200);
        list2.add(1,500);
        System.out.println(list2.get(1) + " and " + list2.get(2));
    }
}
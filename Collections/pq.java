import java.util.*

/*
    Time complexity 

    Add and Offer: O(log(n))
    Peak: O(1)
    Poll and remove head element: O(log(n))
    Remove arbitrary element: O(n)
*/

public class Main{
    public static void main(String[] args) {
        // min heap priority queue example 
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        minPQ.add(5);
        minPQ.add(2);
        minPQ.add(8);
        minPQ.add(1);

        // print all the values 
        minPQ.forEach((Integer val) -> System.out.println(val));

        while(!minPQ.isEmpty()){
            int val = minPQ.poll();
            System.out.println("remove from the top: " + val);
        }

        // max heap prioty queue example
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((Integer a, Integer b) -> b-a);
        maxPQ.add(5);
        maxPQ.add(2);
        maxPQ.add(8);
        maxPQ.add(1);

        // print all the values 
        maxPQ.forEach((Integer val) -> System.out.println(val));

        while(!maxPQ.isEmpty()){
            int val = maxPQ.poll();
            System.out.println("remove from the top: " + val);
        }
    }
}
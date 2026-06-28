import java.util.*;

public class SetExample {
    public static void main(String args[]) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(12);
        set1.add(11);
        set1.add(33);
        set1.add(4);

        Set<Integer> set2 = new HashSet<>();
        set2.add(11);
        set2.add(9);
        set2.add(88);
        set2.add(10);
        set2.add(5);
        set2.add(12);

        // UNION of 2 sets
        set1.addAll(set2);
        System.out.println("after union:");
        set1.forEach((Integer val) -> System.out.println(val));

        // INTERSECTION of 2 sets
        set1 = new HashSet<>();
        set1.add(12);
        set1.add(11);
        set1.add(33);
        set1.add(4);

        set2 = new HashSet<>();
        set2.add(11);
        set2.add(9);
        set2.add(88);
        set2.add(10);
        set2.add(5);
        set2.add(12);

        set1.retainAll(set2);
        System.out.println("after Intersection:");
        set1.forEach((Integer val) -> System.out.println(val));

        // DIFFERENCE of 2 sets
        set1 = new HashSet<>();
        set1.add(12);
        set1.add(11);
        set1.add(33);
        set1.add(4);

        set2 = new HashSet<>();
        set2.add(11);
        set2.add(9);
        set2.add(88);
        set2.add(10);
        set2.add(5);
        set2.add(12);

        set1.removeAll(set2);
        System.out.println("after Difference: ");
        set1.forEach((Integer val) -> System.out.println(val));
    }
}
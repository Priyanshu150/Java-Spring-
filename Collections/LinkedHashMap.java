import java.util.*;

/*
    - Time complexit y is same as of HashMap: Average O(1)
    - Its not thread safe and there is no thread safe version available for this
      so we have to explicitly make it this collection thrread safe like this:

      Map<Integer, String> map2 = Collections.synchronizedMap(new LinkedHashMap<>())
*/

public class LinkedHashMapExample {

    public static void main(String args[]) {

        System.out.println("----------below is LinkedHashMap output ------------");

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1,   "A");
        map.put(21,  "B");
        map.put(23,  "C");
        map.put(141, "D");
        map.put(25,  "E");
        map.forEach((Integer key, String val) -> System.out.println(key + ":" + val));

        System.out.println("----------below is normal hash map output ------------");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1,   "A");
        map2.put(21,  "B");
        map2.put(23,  "C");
        map2.put(141, "D");
        map2.put(25,  "E");
        for (Map.Entry<Integer, String> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}

// with ACCESS ORDER = True
public class LinkedHashMapExample2 {

    public static void main(String args[]) {

        System.out.println("----------below is LinkedHashMap output ------------");

        // initialCapacity=16, loadFactor=0.75, accessOrder=true
        Map<Integer, String> map = new LinkedHashMap<>(16, .75F, true);
        map.put(1,   "A");
        map.put(21,  "B");
        map.put(23,  "C");
        map.put(141, "D");
        map.put(25,  "E");

        // accessing some data
        map.get(23);
        map.forEach((Integer key, String val) -> System.out.println(key + ":" + val));
    }
}
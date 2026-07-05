import java.util.*;

public class Main{
    public static void main(String[] args) {
        // Different ways to create stream

        // 1. from collecton
        List<Integer> salaryList = Arrays.asList(3000, 4100, 9000, 1000, 3500);
        Stream<Integer> streamFromIntegerList = salaryList.stream();


        // 2. from array 
        Integer[] salaryArray = {3000, 4100, 9000, 1000, 3500};
        Stream<Integer> streamFromIntegerArray = Arrays.stream(salaryArray);

        // 3. from static method 
        Stream<Integer> streamFromStaticMethod = Stream.of(1000, 3500, 4000, 9000);

        // 4. From stream builder
        Stream.Builder<Integer> streamBuilder = Stream.builder();
        streamBuilder.add(1000).add(9000).add(3500);

        Stream<Integer> streamFromStreamBuilder = streamBuilder.build()

        // from stream iterate:
        Stream<Integer> streamFrromIterate = Stream.iterate(100, (Integer n) -> n + 5000).limit(5);
    }
}
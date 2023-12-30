package practice;

import java.util.*;
import java.util.stream.Stream;

public class StreamApiEx {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(4);

        int result = arr.parallelStream()
                .filter(n -> n % 2 == 1)
                .map(n -> n * 2)
                .reduce(0, (s, e) -> s + e);

        // Stream<Integer> stream1 = arr.stream();
        // Stream<Integer> stream2 = stream1.filter(n -> n % 2 == 1);
        // Stream<Integer> stream3 = stream2.map(n -> n * 2);
        // int result = stream3.reduce(0, (s, e) -> s + e);
        // stream3.forEach(n -> System.out.println(n));
        System.out.println(result);
    }
}

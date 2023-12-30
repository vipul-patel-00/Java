package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApiEx1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 8);
        // Predicate p = new Predicate<Integer>() {
        // public boolean test(Integer t) {
        // if (t % 2 == 0)
        // return true;
        // else
        // return false;
        // };
        // };
        Integer i = list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (s, e) -> e - s);

        System.out.println(i);
    }
}

package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("vipul", "narayan", "dj", "salil", "vipul");
        Boolean b = list.stream().anyMatch(n -> n == "vipul");
        System.out.println(b);
        Stream s = list.stream().limit(3);
        s.forEach(n -> System.out.println(n));
    }
}

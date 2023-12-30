package practice;

import java.util.*;

public class HashSetCollection {
    public static void main(String[] args) {
        HashSet hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(1);
        hs.add(null);
        System.out.println(hs);

        LinkedHashSet lhs = new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(2);
        lhs.add(2);
        lhs.add(null);
        System.out.println(lhs);

        
    }
}
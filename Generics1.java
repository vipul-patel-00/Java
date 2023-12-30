package practice;

import java.util.*;

public class Generics1 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(20);
        a.add(10);
        a.add(30);
        Object o = a.get(0);
        Integer i = a.get(1);
        System.out.println(o);
        System.out.println(i);
        Collection<String> c = new ArrayList<>();
        Collection<Number> c1 = new ArrayList<Number>();

    }
}

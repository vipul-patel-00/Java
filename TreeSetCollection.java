package practice;

import java.util.*;

public class TreeSetCollection {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>();
        ts.add("100");
        ts.add("vipul");
        ts.add("i");
        ts.add("hii");

        String c = "i";
        String s = "hii";

        System.out.println(ts.subSet("100", true, "i", true));
        System.out.println(c.compareTo(s));

        System.out.println(ts);

    }

}
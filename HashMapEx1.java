package practice;

import java.util.*;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap hm = new HashMap<>();
        hm.put("vipul", "patel");
        hm.put("chotu", "motu");
        hm.put("prince", "ppp");
        hm.put("kaju", "420");
        Set s = hm.keySet();
        Collection c = hm.values();
        System.out.println(s);
        System.out.println(s.getClass().getName());
        System.out.println(c);
        System.out.println(c.getClass().getName());
        Set s1 = hm.entrySet();
        System.out.println(s1);
        System.out.println(s1.getClass().getName());

    }
}

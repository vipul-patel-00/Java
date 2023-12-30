package practice;

import java.util.PriorityQueue;

public class CollectionPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue<>();
        p.add("11");
        p.add("patel");
        p.add("patel");

        // p.add(null); null values are not allowed in priorityque

        Test1 t = new Test1();
        // p.addAll(t.array(t.ad));

        p.forEach((n) -> System.out.println(n));
    }
}

package practice;

import java.util.*;

public class CollectionEx1 {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add('a');
        al.add(25.5);
        al.add("hello");
        al.add(25.5);
        al.add(100);
        al.add(25.5);
        // al.add(null);
        System.out.println(al.get(1).hashCode());
        al.forEach((n) -> System.out.println(n.hashCode()));

        // ArrayDeque ad = new ArrayDeque<>();
        // ad.add(1);
        // ad.add(200);

        // ad.addAll(al);
        // ad.offer(12);
        // ad.forEach((n) -> System.out.println(n));
        // System.out.println("*************************");
        // Object o = ad.element();
        // System.out.println(ad.peek());
        // System.out.println("*************************");
        // ad.forEach((n) -> System.out.println(n));
        // System.out.println("o is from element" + " " + o);

        // Object[] arr = al.toArray();
        // System.out.println(al.lastIndexOf(100));
        // LinkedList ll = new LinkedList();
        // ll.add(100);
        // ll.add(200);
        // ll.add(300);
        // ll.add(25.5);
        // ll.add('a');
        // System.out.println(Arrays.toString(arr));
        // // Object a = al.clone();
        // System.out.println(al.hashCode());

        // System.out.println(al.retainAll(ll));

        // System.out.println(al.hashCode());
        // System.out.println(al.getClass());

        // Iterator i = al.iterator();
        // ListIterator li = al.listIterator(al.size());
        // while (li.hasPrevious()) {
        // System.out.println(li.previous());
        // }

        // al.forEach((n) -> System.out.println(n));

    }

}

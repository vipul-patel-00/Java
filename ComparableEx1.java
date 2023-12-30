package practice;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableEx1 {
    public static void main(String[] args) {
        ArrayList<Movies> list = new ArrayList<>();
        list.add(new Movies("veer Zara", 8, 2000));
        list.add(new Movies("Sita Ramam", 9, 2022));
        list.add(new Movies("Kick", 4, 2015));

        Collections.sort(list);
        System.out.println(list);
    }
}

class Movies implements Comparable<Movies> {
    String name;
    int rating;
    int year;

    Movies(String name, int rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    @Override
    public String toString() {
        return "name : " + name + " rating : " + rating + " year :" + year;
    }

    @Override
    public int compareTo(Movies m) {
        return this.year - m.year;
    }
}

package practice;

import java.util.*;

class HashMapEx2 {
    public static void main(String[] args) {
        Hashtable hm = new Hashtable();// Default capacity is 11
        hm.put(new Temp(5), "A");
        hm.put(new Temp(2), "B");
        hm.put(new Temp(6), "C");
        hm.put(new Temp(15), "D");
        hm.put(new Temp(23), "E");
        hm.put(new Temp(16), "f");
        System.out.println(hm);
    }
}

class Temp {
    int i;

    Temp(int i) {
        this.i = i;
    }

    public int hashCode() {
        return i;
    }

    public String toString() {
        return i + " ";
    }
}
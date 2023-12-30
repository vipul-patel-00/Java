package practice;

import java.util.*;

class HashMapGarbageEx1 {
    public static void main(String[] args) throws InterruptedException {
        HashMap hm = new HashMap();
        Temp1 t = new Temp1();
        hm.put(t, "shri");
        System.out.println(hm);// {temp=shri}
        t = null;// Making eligible for Garbage Collection
        System.gc();// Triggering garbage collector thread to clean 't'
        Thread.sleep(5000);
        System.out.println(hm);// {temp=shri}
    }
}

class Temp1 {
    @Override
    public String toString() {
        return "temp";
    }

    @Override
    public void finalize() {
        System.out.println("cleaning temp object");
    }
}

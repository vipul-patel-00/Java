package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

class Student implements Comparable<Student> {
    int age;
    String name;
    String tech;

    Student(int age, String name, String tech) {
        this.age = age;
        this.name = name;
        this.tech = tech;
    }

    public String toString() {
        return "student [age=" + age + ",name= " + name + ",tech= " + tech + "]";
    }

    @Override
    public int compareTo(Student that) {
        // TODO Auto-generated method stub
        return this.tech.length() - that.tech.length();
    }

}

public class CollectionsEx1 {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(20, "vipul", "java"));
        al.add(new Student(22, "viral", "python"));
        al.add(new Student(18, "somya", "cpp"));
        Collections.sort(al);
        Stream stream = al.stream().filter(n -> n.tech == "java");
        System.out.println(al);
        stream.forEach(n -> System.out.println(n));

    }
}

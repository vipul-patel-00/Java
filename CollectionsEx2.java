package practice;

import java.util.*;

class ComparatorImp implements Comparator<Student1> {
    public int compare(Student1 s1, Student1 s2) {
        return s1.age - s2.age;
    }

}

public class CollectionsEx2 {
    public static void main(String[] args) {

        Comparator<Student1> com = new ComparatorImp();
        ArrayList<Student1> al1 = new ArrayList<>();
        al1.add(new Student1(20, "vipul", "java"));
        al1.add(new Student1(22, "viral", "python"));
        al1.add(new Student1(18, "somya", "cpp"));
        Collections.sort(al1, com);
        System.out.println(al1);

    }
}

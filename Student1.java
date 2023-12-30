package practice;

public class Student1 {
    int age;
    String name;
    String tech;

    Student1(int age, String name, String tech) {
        this.age = age;
        this.name = name;
        this.tech = tech;
    }

    public String toString() {
        return "student [age=" + age + ",name= " + name + ",tech= " + tech + "]";
    }

}

package practice;

//local variables has to be defined as they do not contain any default values
// instance variables contains default values
class Demo {
    int i = 65;

    public void display() {
        int a = 0;
        System.out.println(a + "" + i + ".....");
    }
}

public class LocalAndInstance {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();
    }
}

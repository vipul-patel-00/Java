public class MainClass {
    public static void main(String[] args) {
        Inheritance i = new Inheritance();
        i.hello();
        Inheritance c = new Child();
        ((Child) c).hello();
    }
}

class Inheritance {

    public static void hello() {
        System.out.println("hiiii........");
    }
}

class Child extends Inheritance {
    // @Override
    public static void hello() {
        System.out.println("hellooo.............");
        Inheritance.hello();
    }
}

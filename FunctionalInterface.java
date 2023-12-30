package practice;

interface Com {
    void show(String s);
}

public class FunctionalInterface {
    public static void main(String[] args) {
        // Com c = new Com() {
        // public void show() {
        // System.out.println("Hii this is show");
        // }
        // };
        // c.show();
        Com c = (s) -> System.out.println("hello this is show and I am " + s);
        c.show("vipul");
    }
}

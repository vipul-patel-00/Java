package practice;

interface Computer {
    void display();

    default void show() {
        System.out.println("hello ! this is show method");
    }
}

class Laptop implements Computer {
    @Override
    public void display() {
        System.out.println("this is overridden method of computer Interface");
    }

}

public class Interface {
    public static void main(String[] args) {
        Laptop L = new Laptop();
        L.display();
        L.show();
    }
}

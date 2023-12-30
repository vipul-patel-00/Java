package practice;

class Gen<T> {
    T obj;

    Gen(T obj) {
        this.obj = obj;
    }

    public void show() {
        System.out.println(obj.getClass().getName());
    }

    public T get() {
        return obj;
    }
}

public class Generics2 {
    public static void main(String[] args) {
        Gen<Integer> gen = new Gen<Integer>(20);
        gen.show();
        System.out.println(gen.get());

    }
}

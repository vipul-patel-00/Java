// bounded type Generics

package practice;

class Generics<T extends Number> {
    T object;

    Generics(T object) {
        this.object = object;
    }

    public void show() {
        System.out.println(object.getClass().getName());
    }

    public T getObject() {
        return object;
    }
}

public class Generics3 {
    public static void main(String[] args) {
        Generics<Integer> g1 = new Generics<Integer>(20);
        Generics<Double> g2 = new Generics<Double>(3.9);
        g2.show();
        System.out.println(g2.getObject());
    }

}

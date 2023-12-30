package practice;

public class MethodOverLoading {
    public static void add(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    private int add(int a, int b, int c) {
        int d = a + b + c;
        System.out.println(d);
        return d;
    }

    public static void main(String[] args) {
        MethodOverLoading m = new MethodOverLoading();
        add(1, 2);
        m.add(1, 2, 3);
    }
}

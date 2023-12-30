package practice;

public class Exception {
    public static void main(String[] args) {
        Beta b = new Beta();
        b.display();
    }
}

class Alpha {

    public void division() {
        int i = 8;
        int j = 0;
        try {
            int k = i / j;
            System.out.println(k);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}

class Beta {
    public void display() {
        Alpha a = new Alpha();
        a.division();
    }
}

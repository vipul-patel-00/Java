class Pow {
    int p = 1;

    public int power(int n) {
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                p = 1;
            } else {
                p = p * 2;
            }
        }
        return p;
    }
}

class Power {
    public static void main(String[] args) {
        Pow p1 = new Pow();
        System.out.println(p1.power(0));
        System.out.println(p1.power(1));
        System.out.println(p1.power(4));
    }
}

package practice;

public class ToStringVSHashCodeEx1 {
    int i;

    ToStringVSHashCodeEx1(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        ToStringVSHashCodeEx1 t1 = new ToStringVSHashCodeEx1(10);
        ToStringVSHashCodeEx1 t2 = new ToStringVSHashCodeEx1(100);
        System.out.println(t1);// Test@....
        System.out.println(t2);// Test@....
    }

}

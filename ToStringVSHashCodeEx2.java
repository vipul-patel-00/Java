package practice;

public class ToStringVSHashCodeEx2 {
    int i;

    ToStringVSHashCodeEx2(int i) {
        this.i = i;
    }

    public int hashCode() {
        return i;
    }

    public static void main(String[] args) {
        ToStringVSHashCodeEx2 t1 = new ToStringVSHashCodeEx2(10);
        ToStringVSHashCodeEx2 t2 = new ToStringVSHashCodeEx2(100);
        System.out.println(t1);// Test@A
        System.out.println(t2);// Test@64
    }
}

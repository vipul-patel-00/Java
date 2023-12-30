public class PrintWithoutLoop {
    static int i = 0;
    static PrintWithoutLoop[] p = new PrintWithoutLoop[10];
    static {
        System.out.println("0");
    }

    public PrintWithoutLoop() {
        i++;
        System.out.println(i);
    }
}

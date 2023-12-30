package practice;

class Threads implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getId());
    }
}

public class MultiEx2 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            Thread t = new Thread(new Threads());
            t.start();
        }
    }
}

package practice;

// example of multithreading using only one run method for 3 different threads.....................

class MultiThreads extends Thread {
    Functions f = new Functions();

    synchronized public void run() {
        String Name = Thread.currentThread().getName();
        if (Name == "vipul") {
            f.method1();
        } else if (Name == "viral") {
            f.method2();
        } else if (Name == "prince") {
            f.method3();
        }

    }
}

class Functions {
    public void method1() {
        System.out.println("this is method1");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("again method1");
    }

    public void method2() {
        System.out.println("this is method2");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("again method2");
    }

    public void method3() {
        System.out.println("this is method3");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("again method3");
    }
}

public class MultiEx3 {
    public static void main(String[] args) {
        MultiThreads mt = new MultiThreads();
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);
        Thread t3 = new Thread(mt);
        t1.start();
        t2.start();
        t3.start();
        t1.setName("vipul");
        t2.setName("viral");
        t3.setName("prince");
    }
}

package practice;

class Name extends Thread {
    public void run() {
        System.out.println("my name is vipul patel");
        System.out.println("this is Name class........");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class PetName extends Thread {
    public void run() {
        System.out.println("my pet name is mintu");
        System.out.println("this is PetName class..........");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class MultiEx1 {
    public static void main(String[] args) throws InterruptedException {
        Name n = new Name();
        PetName p = new PetName();
        n.start();
        p.start();
        n.join();
        System.out.println(Thread.currentThread().getName());
    }
}

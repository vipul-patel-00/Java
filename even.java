import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is an even number");
        } else
            System.out.println(n + " is a odd number");
    }
}

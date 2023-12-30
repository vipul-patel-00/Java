import java.io.*;
import java.util.*;

public class Split {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int n;
        s = s.trim();
        String[] arrOfStr = s.split("[, ?.@_!']+");
        n = arrOfStr.length;
        if (arrOfStr.length > 0) {
            if (arrOfStr[0] == "") {
                n = arrOfStr.length - 1;
                System.out.println(n);
                for (int i = 1; i < n; i++)
                    System.out.println(arrOfStr[i]);
            } else {
                System.out.println(n);
                for (int i = 0; i < n; i++)
                    System.out.println(arrOfStr[i]);
            }
        } else {
            System.out.println(n);
        }
        scan.close();
    }
}

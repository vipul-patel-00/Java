import java.io.*;
import java.util.*;

public class Split1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int n;
        s = s.trim();
        if (s.length() > 0) {
            String[] arrOfStr = s.split("[, ?.@_!']+");
            n = arrOfStr.length;
            System.out.println(n);
            for (int i = 0; i < n; i++)
                System.out.println(arrOfStr[i]);
        } else {
            System.out.println(0);
        }
        scan.close();
    }
}

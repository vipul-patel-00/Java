import java.util.Scanner;
public class main{
    public static void main (String args[]) {
        int []arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the numbers\n");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            
        }
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        }
    }
}
import java.util.Scanner;
class array{
    void ls(){
        Scanner sc = new Scanner(System.in);
    int [][]a = new int [5][4];
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a[0].length;j++){
            a[i][j] = sc.nextInt();
        }
    }
    for (int i=0;i<a.length;i++){
        for(int j=0;j<a[0].length;j++){
            System.out.print(a[i][j]);
        }
        System.out.println("");
    }
    }
}




public class twod {
   public static void main(String args[]){
       array b = new array();
       b.ls();
      
   }
}

import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        int count=0,sum=0;
        int []a = new int[5];
                int []arr = new int[5];
                Scanner sc = new Scanner(System.in);
                System.out.print("enter the numbers\n");
                for (int j=0; j<arr.length; j++){
                    arr[j] = sc.nextInt();
                    
                }
                int smallest=arr[0];
                for(int j=0;j<5;j++){
                for(int i=2;i<=arr[j]/2;i++){
                    if(arr[j]%i==0){
                       continue;
                    }
                    else if(i==arr[j]/2){
                        count++;
                        for(int k=0;k<5;k++){
                            a[k]=arr[j];
                        }
                    }
                }
                }
                if(count==0){
                    for(int j = 0;j<5;j++){
                    if(arr[j]<smallest){
                        smallest = arr[j];
                    }
                    }
                    for(int j=0;j<5;j++){
                        sum=sum+arr[j];
                    }
                    System.out.println(sum-smallest);
                }
                else{
                    for(int k=0;k<5;k++){
                        if(a[k]<smallest){
                            smallest = a[k];
                        } 
                    }
                    for(int k=0;k<5;k++){
                        sum=sum+a[k];
                    }
                    System.out.println(sum-smallest);
                }
        
    }
}

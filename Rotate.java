import java.util.*;
public class Rotate {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        // System.out.println("Enter the array value");
        // int arr[]=new int[n];
        // for(int i=0;i<n;i++){
        //   arr[i]=sc.nextInt();
        // }
        System.out.println("Enter the value");
        int r=sc.nextInt();
        while(n>0){
            count++;
            n=n/10;
        }int sum=0;
        int rem=count-r;
        while(r>0){
        int p=n%10;
        sum=sum*10+p;
        r--;
        }
        System.out.println(sum);
    }
}


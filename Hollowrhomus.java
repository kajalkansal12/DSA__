
import java.util.Scanner;
public class Hollowrhomus {
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number");
     int n=sc.nextInt();
     for(int i=0;i<n;i++){
         for(int j=i;j<n-1;j++){
             System.out.print(" ");
         }
         for(int k=0;k<n;k++){
             if(k==0||i==0||i==n-1||k==n-1)
             System.out.print("*");
             else
             System.out.print(" ");
         }
             
        System.out.println();
     }
    

      //System.out.println("Sum of x+y = " + z);
    }
}
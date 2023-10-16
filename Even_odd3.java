import java.util.Scanner;

public class Even_odd3 {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println((n%2==0)?"even":"odd");
    }
}

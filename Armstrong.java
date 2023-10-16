import java.util.Scanner;
// class A{
//     static int check(int a){

//     }
// }
public class Armstrong {
    static void check(int n){
        int s=0;
        int p=n;
        while(n>0){
            int r=n%10;
            s=s+(r*r*r);
            n=n/10;
        }

        if(s==p){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
    }
}
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        check(n);
    }
}

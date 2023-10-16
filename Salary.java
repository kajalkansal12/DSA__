import java.util.*;
public class Salary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Basic Salary");
        float bs=sc.nextFloat();
        float hra=(30*bs)/100;
        float ta=(20*bs)/100;
        float da=(10*bs)/100;
        float pf=1500;
        float net =bs+hra+ta+da-pf;
        System.out.println("Net Salary is"+ net );
    }
} 
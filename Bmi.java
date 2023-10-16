import java.util.*;
public class Bmi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Weight: (in KG)");
        float weigth=sc.nextFloat();
        System.out.println("Enter Height: (in M)");
        float Height=sc.nextFloat();
        float bmi=(weigth/(Height*Height));
        System.out.println("BMI:"+" "+bmi);
    }
    
}

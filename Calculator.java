import java.util.*;
public class Calculator {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Temperature in Celcius");
    float t=sc.nextFloat();
    float nt=(t*9/5) + 32 ;
    System.out.println("Enter Temperature in Fahrenheit");
    float f=sc.nextFloat();
    float nf = (f-32)*5 / 9;
    System.out.println("Temperature in Fahrenhiet:"+nf);
    System.out.println("Temperature in Celcius:"+nt);
    }
}

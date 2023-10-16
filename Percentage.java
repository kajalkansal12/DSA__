import java.util.*;
public class Percentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name=sc.nextLine();
        System.out.println("Enter Your Class:");
        int clas=sc.nextInt();
        System.out.println("Enter Your Maths Marks:");
        float maths =sc.nextFloat();
        System.out.println("Enter Your Hindi Marks:");
        float hindi=sc.nextFloat();
        System.out.println("Enter Your Physics Marks:");
        float physics=sc.nextFloat();
        System.out.println("Enter Your Chemistry Marks:");
        float chemistry=sc.nextFloat();
        System.out.println("Enter Your Biology Marks:");
        float biology=sc.nextFloat();
        float avg_marks=(maths+hindi+physics+chemistry+biology)/5;
        float Percentage=((maths+hindi+physics+chemistry+biology)/500)*100;
        System.out.println("Your Average Marks :" + " "+avg_marks);
        System.out.println("Your Perecentage :"+" "+ Percentage);
    }
}

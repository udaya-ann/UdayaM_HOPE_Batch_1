import java.util.*;
public class MathematicOp {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number for a: ");
        a=sc.nextInt();
        System.out.print("Enter a number for b: ");
        b=sc.nextInt();
        System.out.println("the sum is : "+(a+b));
        System.out.println("the difference is : "+(a-b));
        System.out.println("multiplication is : "+(a*b));
        System.out.println("modulo is : "+(a%b));
        System.out.println("division is: "+(a/b));
    }
}

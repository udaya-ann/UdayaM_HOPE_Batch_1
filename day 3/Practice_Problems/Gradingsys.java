import java.util.*;
public class Gradingsys{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter operator: ");
        String str=sc.next();
        switch(str){
            case "+":
                System.out.println("The sum is : "+(a+b));
                break;
            case "-":
                System.out.println("The diff : "+(a-b));
                break;
            case "*":
                System.out.println("multi is : "+(a*b));
                break;
            case "/":
                System.out.println("division is: "+(a/b));
                break;
            case "%":
                System.out.println("Modulo is: "+(a%b));
                break;
            default:
                System.out.println("Enter valid operator");
        }
    }
}
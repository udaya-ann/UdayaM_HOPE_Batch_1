import java.util.*;
public class DiamondPatternTask2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)System.out.print(" ");
            for(int k=1;k<=(i*2)-1;k++)System.out.print("*");
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++)System.out.print(" ");
            for(int k=1;k<=(n-i)*2-1;k++)System.out.print("*");
            System.out.println();
        }
    }
}
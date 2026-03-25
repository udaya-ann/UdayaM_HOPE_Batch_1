import java.util.*;
public class Leetcode1523Task3 {
    public int countOdds(int low, int high) {
        if(low%2!=0 || high%2!=0)return (high-low)/2 +1;
        return (high-low)/2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting value: ");
        int low=sc.nextInt();
        System.out.print("Enter end value : ");
        int high=sc.nextInt();
        Leetcode1523Task3 l=new Leetcode1523Task3();
        System.out.println("The count of odd numbers of range "+low+" and "+high+ " is:  "+l.countOdds(low,high));
    }
}

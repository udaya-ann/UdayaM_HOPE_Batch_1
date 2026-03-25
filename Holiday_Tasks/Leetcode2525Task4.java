import java.util.*;
public class Leetcode2525Task4 {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean bulky=false;
        boolean heavy=false;
        if(length>=10000 || width>=10000 || height>=10000 || mass>=10000 || (long) length*width*height>=1000000000) bulky=true;
        if(mass>=100)heavy=true;
        if(bulky && heavy)return "Both";
        if(!bulky && !heavy)return "Neither";
        if(bulky && !heavy)return "Bulky";
        return "Heavy";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length: ");
        int length=sc.nextInt();
        System.out.print("Enter width: ");
        int width=sc.nextInt();
        System.out.print("Enter height : ");
        int height=sc.nextInt();
        System.out.print("Enter mass : ");
        int mass=sc.nextInt();
        Leetcode2525Task4 l=new Leetcode2525Task4();
        System.out.print(l.categorizeBox(length,width,height,mass));
    }
}

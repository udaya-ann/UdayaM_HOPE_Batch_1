import java.util.*;
public class Leetcode2864Task5 {
    public String maximumOddBinaryNumber(String s) {
        int onec=0;
        int zeroc=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')onec++;
            else zeroc++;
        }
        StringBuilder str=new StringBuilder();
        for(int j=0;j<onec-1;j++) str.append('1');
        for(int k=0;k<zeroc;k++) str.append('0');
        str.append('1');
        return str.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Leetcode2864Task5 l = new Leetcode2864Task5();
        System.out.println(l.maximumOddBinaryNumber(str));
        
    }
}

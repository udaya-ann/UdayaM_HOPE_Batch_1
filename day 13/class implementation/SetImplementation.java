import java.util.*;

public class SetImplementation{
    public static void main(String[] args) {
        //Set<Integer> set=new HashSet<>();
        // Integer a=1;
        // set.add(a);
        // System.out.println(set.hashCode());
        // set.add(0);
        // System.out.println(set.hashCode());

        // System.out.println(set);
        // System.out.println(set.contains(1));

        Set<String> set= new HashSet<>();
        set.add("Ann");
        set.add("Rohan");
        System.out.println(set);
        set.add("Agnes");
        System.out.println(set);
        set.add("Michelin");
        System.out.println(set);
        System.out.println(set.hashCode());

        for(String s:set) System.out.print(s+" ");

    }
}
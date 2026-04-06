import java.util.*;
//import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
         
        Set<String> set= new LinkedHashSet<>();
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

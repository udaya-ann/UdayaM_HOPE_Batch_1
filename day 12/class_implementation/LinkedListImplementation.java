import java.util.*;
public class LinkedListImplementation {
    public static void main(String[] args) {
        List<String> run=new LinkedList<>();
        run.add("A");
        run.add("B");
        run.add("C");
        run.addFirst("Start race");
        System.out.println(run);
        run.remove("B");
        System.out.println("B is disqualifed due to early start");
        System.out.println(run);
        run.addLast("Race completed");
        System.out.println(run);
        System.out.println("A won in 0.001ms");
    }
}

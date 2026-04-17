import java.util.*;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;
public class FunctionalInterface{
    public static void main(String[] args) {
        // Predicate<Integer> isEven=n->n%2==0;
        // System.out.println(isEven.test(7));
        // System.out.println(isEven.test(8));

        // Consumer<String> val=name -> System.out.println(name);
        // val.accept("udaya");

        Supplier<Double> val=()->Math.random();
        System.out.println(val.get());
        
    }
}
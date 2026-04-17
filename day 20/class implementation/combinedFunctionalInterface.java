import java.util.*;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;;

public class combinedFunctionalInterface {
    public static void main(String[] args) {
        Predicate<Integer> isEven=n->n%2==0;
        Consumer<Integer> val= n-> System.out.println(n);
        Supplier<Integer> value=()->101;
        if(isEven.test(value.get())){
            val.accept(value.get());
        }else{
            System.out.println("Supplier can't be printed");
        }
    }
}

import java.util.*;
public class ArrayListImplementation{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        // List<Integer> arrlist=new LinkedList<>();
        list.add(null);
        list.add(10);
        list.add(20);
        System.out.println(list); //[null, 10, 20]

        list.set(0,5);//set()
        System.out.println(list);

        list.remove(1);//remove()
        System.out.println(list);

        list.add(1,15);//add()
        System.out.println(list);
        
        System.out.println(list.get(2));//get()

        System.out.println(list.contains(15));//contains()

        list.addFirst(1);//addFirst()
        list.addLast(25);//addLast()
        System.out.println(list);

        System.out.println(list.size());//size()

        //list allow duplicate elements

        System.out.println(list.isEmpty());//isEmpty()

        list.clear();

        System.out.println(list.isEmpty());
        System.out.println(list);

    }
}
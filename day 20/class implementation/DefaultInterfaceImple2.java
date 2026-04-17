interface Method{
    default void display(){
        System.out.println("welcome to interface implementation");
    }
}
class Hello implements Method{
    // public void display(){
    //     System.out.println("overrided the old");
    // }
}

public class DefaultInterfaceImple2 {
    public static void main(String[] args) {
        Hello h=new Hello();
        h.display();
    }
}

interface A{
    void show();
}
class B implements A{
    public void show(){
        System.out.println("Hello");
    }
}
class C implements A{
    public void show(){
        System.out.println("Hi");
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
        B b =new B();
        b.show();
        C c = new C();
        c.show();
    }
}

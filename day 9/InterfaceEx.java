interface A{
    void show();
}
interface B{
    void display();
}
class C implements A,B{
    public void display(){
        System.out.println("Display");
    }
    public void show(){
        System.out.println("Show");
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
        C c=new C();
        c.display();
        c.show();
    }
}

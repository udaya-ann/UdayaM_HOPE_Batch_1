abstract class A{
    abstract void show();
    
}
class B extends A{
    void show(){
        System.out.println("show hello");
    }
   
}
class C extends A{
    void show(){
        System.out.println("hi from C");
    }
}

class Abstraction{
    public static void main(String[] args) {
        B b = new B();
        b.show();
        C c=new C();
        c.show();
    }
}
class Parent{
    void display(){
        System.out.println("This is parant class");
    }
}
class Child extends Parent{
    void display1(){
        System.out.println("This is child class");
    }
}
public class SimpleInheritance {
    public static void main(String[] args) {
        Child c= new Child();
        c.display();
        c.display1();
    }
}

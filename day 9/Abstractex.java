abstract class Animal{
    abstract void sound();
    void eat(){
        System.out.println("Eating");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Barks");
    }
}
class Cat extends Dog{
    void sound(){
        System.out.println("Meow");
        super.sound();
    }
}
public class Abstractex {
    public static void main(String[] args) {
        Animal c=new Cat();
        c.sound();
        c.eat();

    }
}

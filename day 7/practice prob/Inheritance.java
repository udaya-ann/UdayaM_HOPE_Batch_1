class Animal{
    void display(){
        System.out.println(" There are multiple animals choose 1 and it's sound");
    }
}
class Dog {
    void bark(){
        System.out.println("Dog barks");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog s= new Dog();
        s.bark();
        System.out.println(s.hashCode());
    }
}

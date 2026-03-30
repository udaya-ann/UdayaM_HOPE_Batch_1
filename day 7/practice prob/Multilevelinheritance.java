class GrandParent{
    void grandp(){
        System.out.println("We are the grand parents of the family");
    }
}
class Parent extends GrandParent{
    void parent(){
        System.out.println("We are the parents of the family");
    }
}
class Child extends Parent{
    void child(){
        System.out.println("We are the childrens of the family");
    }
}

public class Multilevelinheritance {
    public static void main(String[] args) {
        Child c=new Child();
        c.grandp();
        c.parent();
        c.child();
    }
}

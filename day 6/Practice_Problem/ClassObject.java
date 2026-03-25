public class ClassObject {
    public static void main(String[] args) {
        SecondClass sc = new SecondClass();
        sc.display();
        System.out.println(" Inside main method");
    }
}
class SecondClass {
    void display() {
        System.out.println(" Inside display method");
    }  
}

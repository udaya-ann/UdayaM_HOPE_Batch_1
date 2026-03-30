public class ConstructorOverloading {
    int a, b;

    ConstructorOverloading() {
        a = 0;
        b = 0;
    }

    ConstructorOverloading(int x, int y) {
        a = x;
        b = y;
    }

    ConstructorOverloading(int x) {
        a = x;
        b = x;
    }

    void display() {
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(5, 10);
        ConstructorOverloading obj3 = new ConstructorOverloading(7);

        obj1.display();
        obj2.display();
        obj3.display();
    }
}
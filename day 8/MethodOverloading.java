public class MethodOverloading {
     static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(2, 3));        // 5
        System.out.println(add(2, 3, 4));     // 9
        System.out.println(add(2.5, 3.5));    // 6.0
    }
}

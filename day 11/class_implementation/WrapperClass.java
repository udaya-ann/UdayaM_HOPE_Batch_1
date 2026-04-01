public class WrapperClass{
    public static void main(String[] args) {
        // int a=10;
        // System.out.println(a);
        // Integer i=  Integer.valueOf(a);
        // System.out.println(i);
        // System.out.println(a==i);
        // System.out.println(i.hashCode());
        // i is an object 

        Character c='a';
        System.out.println(c);
        System.out.println(c.hashCode());
        char b=c.charValue();
        System.out.println(b);
        System.out.println(c==b);
    }
}
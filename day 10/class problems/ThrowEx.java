public class ThrowEx {
    public static void main(String[] args) {
        int age=15;
        if(age<18){
            throw new ArithmeticException("You are not eligible for voting");
        }else{
            System.out.println("You are eligible for voting");
        }
    }
}

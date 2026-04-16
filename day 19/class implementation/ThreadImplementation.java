// import java.util.*;
class Timer1 extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            try {
                System.out.println("Thread 1 value is : "+i);
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
    }
}
class Timer2 extends Thread{
    int j;
    public void run(){
        for(int i=0;i<=5;i++){
            try {
                System.out.println("Thread 2 value is : "+i);
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }
            j=i;
        }
    }
}
public class ThreadImplementation {
    public static void main(String[] args) {
        Timer1 m=new Timer1();
        Timer2 t=new Timer2();
        m.start();
        t.start();
        try {
            t.join();
            System.out.println("j value is : "+t.j);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}

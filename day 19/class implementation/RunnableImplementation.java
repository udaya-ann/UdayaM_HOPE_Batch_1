class Timer implements Runnable{
    public void run(){
        for(int i=0;i<=5;i++){
            try {
                System.out.println(Thread.currentThread().getName() +"thread value is : "+i);
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
    }

}
public class RunnableImplementation {
    public static void main(String[] args) {
        Timer t1=new Timer();
        Timer t2=new Timer();
        Thread th1=new Thread(t1);
        Thread th2=new Thread(t2);
        th1.start();
        th2.start();
    }
}

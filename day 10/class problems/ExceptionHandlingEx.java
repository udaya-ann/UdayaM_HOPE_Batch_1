import java.io.FileReader;

public class ExceptionHandlingEx {
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("Getter");
            System.out.println(fr);

        }catch(Exception e){
            System.out.println("enter valid file name");
           // e.printStackTrace();
        }
    }
}

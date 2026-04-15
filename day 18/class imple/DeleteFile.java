import java.io.*;

public class DeleteFile {
    public static void main(String[] args) {
        File file=new File("file.txt");
        try {
            if(file.delete())System.out.println("file deleted successfully");
            else System.out.println("cant delete");
            //file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

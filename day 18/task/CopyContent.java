import java.io.*;

public class CopyContent {
    
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("source.txt");
        FileOutputStream fos = new FileOutputStream("dest.txt");

        int data;
        while ((data = fis.read()) != -1) {
            fos.write(data);
        }

        fis.close();
        fos.close();
    }
}

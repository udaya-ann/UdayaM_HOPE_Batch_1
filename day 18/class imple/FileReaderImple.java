import java.io.*;

public class FileReaderImple {
    public static void main(String[] args) {
        try {
            FileReader reader=new FileReader("file.txt");
            int i;
            while((i=reader.read())!=-1){
                System.out.print(i+" ");
                System.out.print((char)i+"        ");
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

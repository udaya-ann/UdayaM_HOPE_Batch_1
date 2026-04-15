import java.io.*;

public class BufferReaderImple {
    public static void main(String[] args) {
        try {
            BufferedReader bf=new BufferedReader(new FileReader("file.txt"));
            while(bf.ready()){
                System.out.println(bf.readLine());
            }
            bf.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

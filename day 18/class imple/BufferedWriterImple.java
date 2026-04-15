import java.io.*;

public class BufferedWriterImple {
    public static void main(String[] args) {
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter("file.txt",true));
            bw.newLine();
            bw.write("Appending to the existing one");
            bw.newLine();
            bw.write("next line");
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

import java.io.*;
public class FileWriterImplementation {
    public static void main(String[] args) {
            try {
                FileWriter writer = new FileWriter("file.txt");
                writer.write("Hello, this is a test file.");
                writer.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file.");
                e.printStackTrace();
            }
    }
}
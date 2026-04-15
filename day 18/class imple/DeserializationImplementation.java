import java.io.FileInputStream;
import java.io.ObjectInputStream; 
import java.io.Serializable;  
class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class DeserializationImplementation {

    public static void main(String[] args) {
        try {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream("data.ser"));

            Student s = (Student) in.readObject();
            in.close();

            System.out.println("Object deserialized");
            System.out.println("ID: " + s.id);
            System.out.println("Name: " + s.name);
        } catch (Exception e) {
            e.printStackTrace();
    }
}
}
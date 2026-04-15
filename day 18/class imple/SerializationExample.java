import java.io.*;

class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializationExample {
    public static void main(String[] args) throws Exception {

        Student s = new Student(1, "Suga");

        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("data.ser"));

        out.writeObject(s);
        out.close();

        System.out.println("Object serialized");
    }
}
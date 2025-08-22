package File_Handling;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class StuSerialization {
    public static void main(String[] args) {
        Student emp = new Student(101, "nara");

        try {
            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(emp);  // serialize object

            oos.close();
            fos.close();

            System.out.println("Serialized to student.ser");
        } catch (IOException e) {
            System.out.println("Serialization failed");
            e.printStackTrace();
        }
    }
}

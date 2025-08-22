package File_Handling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
public class StudentDeSerialization {
	

	public class StuDeserialization {
	    public static void main(String[] args) {
	        try {
	            FileInputStream fis = new FileInputStream("student.ser");
	            ObjectInputStream ois = new ObjectInputStream(fis);

	           
	            Student emp = (Student) ois.readObject();

	            ois.close();
	            fis.close();
	            System.out.println("DeSerialized to student.ser");
	           
	            emp.display();

	        } catch (IOException e) {
	            System.out.println("Deserialization failed");
	            e.printStackTrace();
	        } catch (ClassNotFoundException e) {
	            System.out.println("Student class not found");
	            e.printStackTrace();
	        }
	    }
	}

}

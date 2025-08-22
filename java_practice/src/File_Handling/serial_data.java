package File_Handling;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class serial_data {

public static void main(String[] args) {
	
   Employee emp=new Employee(101,"nara");
try
{
FileWriter ew=new FileWriter("employee.txt");
BufferedWriter bf=new BufferedWriter(ew);
bf.write(emp.toString());
bf.newLine();
bf.close();
ew.close();
System.out.println("done");

}
catch(IOException e)
{
	System.out.println("failed");
	System.out.println(e);
}
	}

}

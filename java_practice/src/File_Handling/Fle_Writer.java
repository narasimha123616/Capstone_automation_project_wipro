package File_Handling;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Fle_Writer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
BufferedWriter f=new BufferedWriter( new FileWriter("sample.txt"));
f.write("Hello");
f.newLine();
f.write("hi morning");
	f.close();
	System.out.println("successfully written");
	
}
catch(IOException e){
	e.printStackTrace();


}
	}

}

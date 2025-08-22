package File_Handling;
import java.io.File;

public class create_New_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File f=new File("C:\\Users\\nkuru\\OneDrive\\Desktop\\TLM connections\\New folder\\sample.txt");
try {
	f.createNewFile();
	System.out.println(f.setWritable(true));
}
catch(Exception e){
	System.out.println("file not found");
	System.out.println(e);
	
}
	}

}

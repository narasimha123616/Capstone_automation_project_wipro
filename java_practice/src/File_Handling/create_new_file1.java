package File_Handling;
import java.io.File;

public class create_new_file1 {
	
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	File f=new File("C:\\Users\\nkuru\\OneDrive\\Desktop\\TLM connections\\New folder\\sample1.txt");
	try {
		f.createNewFile();
		System.out.println(f.setWritable(true));
		System.out.println("enter successfully");
		
	}
	catch(Exception e){
		System.out.println("file not found");
		System.out.println(e);
		
	}
		}

	}



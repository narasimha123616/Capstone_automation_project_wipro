package File_Handling;

import java.io.File;

public class File_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File f=new File("sample.txt");
if(f.exists())
{
	System.out.println("file name:"+f.getName());
	System.out.println("file name:"+f.getAbsolutePath());
	System.out.println("file name:"+f.length());
	System.out.println("file name:"+f.canRead());
	System.out.println("file name:"+f.canWrite());
}
else
{
	System.out.println("file not name:");
}
	}

}

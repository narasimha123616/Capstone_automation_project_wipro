package File_Handling;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class File_Write_Read {
	 public static void main(String[] args) {
	        String fileName = "C:\\\\Users\\\\nkuru\\\\OneDrive\\\\Desktop\\\\TLM connections\\\\New folder\\\\sample1.txt";
	        String content = " Hello, this is file handling in Java!";
	        
	        try {
	            FileWriter writer = new FileWriter(fileName,true);
	            writer.write(content);
	            writer.close();
	            System.out.println(" File written successfully.");
	        } catch (IOException e) {
	            System.out.println("Error writing to file: " + e.getMessage());
	        }

	        try {
	            BufferedReader reader = new BufferedReader(new FileReader(fileName));
	            String line;
	            System.out.println(" File content:");
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	            reader.close();
	        } catch (IOException e) {
	            System.out.println(" Error reading from file: " + e.getMessage());
	        }
	    }
}




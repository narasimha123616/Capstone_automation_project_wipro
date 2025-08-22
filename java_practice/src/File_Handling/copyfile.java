package File_Handling;
import java.io.*;
import java.nio.file.*;
public class copyfile {
	

	
	    public static void main(String[] args) {
	        String sourceFile = "original.txt";
	        String destinationFile = "copy.txt";
	        String content = "This is the content of the original file.";

	        try {
	            // Step 1: Write content to the source file
	            Files.write(Paths.get(sourceFile), content.getBytes());
	            System.out.println("Content written to " + sourceFile);

	            // Step 2: Copy content from source file to destination file
	            Files.copy(Paths.get(sourceFile), Paths.get(destinationFile), StandardCopyOption.REPLACE_EXISTING);
	            System.out.println("File copied to " + destinationFile);
	            
	        } catch (IOException e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        }
	    }
	}



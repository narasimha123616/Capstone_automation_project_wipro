package File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File_reader {

    public static void main(String[] args) {
        try {
            BufferedReader r = new BufferedReader(new FileReader("sample.txt"));
            String line;
            
            if ((line = r.readLine()) != null) {
                System.out.println(line);
            } else {
                System.out.println("File is empty or not found");
            }

            r.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

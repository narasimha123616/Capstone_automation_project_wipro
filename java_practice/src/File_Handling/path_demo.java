package File_Handling;


import java.nio.file.Path;
import java.nio.file.Paths;

public class path_demo {

    public static void main(String[] args) {

        Path path = Paths.get("sample.txt");  // ✅ Correct way to get a Path instance

        System.out.println("File Name: " + path.getFileName());
        System.out.println("Absolute Path: " + path.toAbsolutePath());
    }
}


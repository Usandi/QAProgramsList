package IOHandling;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class CopyContentsToFile {
    public static void main(String[] args) throws IOException {

        File fromfile = new File("C:\\Usha\\Profgeams\\FileDirectory\\testfile.txt");
        File tofile = new File("C:\\Usha\\Profgeams\\FileDirectory\\testfile1.txt");

        Files.copy(fromfile.toPath(), tofile.toPath(), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File cpoied");
    }
}

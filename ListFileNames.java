package IOHandling;

import java.io.File;

public class ListFileNames {
    public static void main(String[] args) {
        File f = new File("C:\\Usha\\Profgeams\\FileDirectory");
        File[] filenames = f.listFiles();
        System.out.println("File names are--");
        for (File f1: filenames) {
            System.out.println(f1.getName());
        }
    }
}

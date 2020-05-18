package IOHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchReplaceStringInFile {
    public static void main(String[] main) throws IOException {
        FileReader fr = new FileReader("C:\\Usha\\Profgeams\\FileDirectory\\wordsfile.txt");
        BufferedReader br = new BufferedReader(fr);
        String s = br.readLine();
        System.out.println(s);
        String s1[] = s.split(" ");
        String string = "file";
        int count = 0;
        for (int i=0; i<s1.length; i++) {
            if (s1[i].equals(string)) {
                s1[i] = "replace";
            }
            System.out.print(s1[i]+" ");
        }
    }
}

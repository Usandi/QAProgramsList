package IOHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SearchStringInFile {
    public static void main(String[] main) throws IOException {
        FileReader fr = new FileReader("C:\\Usha\\Profgeams\\FileDirectory\\wordsfile.txt");
        BufferedReader br = new BufferedReader(fr);
        String s = br.readLine();
        String s1[] = s.split(" ");
        String string = "word";
        int count = 0;
        for (int i=0; i<s1.length; i++) {
            if (s1[i].equals(string)) {
                count++;
            }
        }
        System.out.println(s);
        System.out.println("The string "+"'"+string+"'"+" occured "+count+ " times");
    }
}

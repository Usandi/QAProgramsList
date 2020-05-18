package IOHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWordsFrFile {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Usha\\Profgeams\\FileDirectory\\wordsfile.txt");
        BufferedReader br = new BufferedReader(fr);
        String s[];
        String s1 = br.readLine();
        System.out.println(s1);

        s = s1.split(" ");

        br.close();

        System.out.println("There are "+s.length+" words in the file");
    }
}

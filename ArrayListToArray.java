package Collections;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Jasmin");
        al.add("Rose");
        al.add("Marigold");
        al.add("Tulip");
        int l = al.size();
        String s[] = new String[l];
        for (int i=0; i<al.size(); i++) {
            s[i] = al.get(i);
            System.out.println(s[i]);
        }
    }
}
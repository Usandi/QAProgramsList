package Strings;

public class SplitStringWithNumbers {
    public static void main(String[] args) {
        String s = "Hello how are you";
        String[] s1 = s.split("\\s+");
        int c = 1;
        for(int i=0; i<s1.length; i++) {
            s1[i] = s1[i] + c +" ";
            System.out.print(s1[i]);
            c++;
        }
    }
}

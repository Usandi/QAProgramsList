package Strings;

public class ReverseAString {
    public static void main(String[] args) {
        String s = "aloha";
        char a[] = s.toCharArray();
        char b[] = new char[a.length];
        int c =0;
        for (int i=a.length-1; i>=0; i--) {
            b[c++] = a[i];
        }
        String s1 = new String(b);
        System.out.println("Original string is "+s);
        System.out.println("Reversed string is "+s1);
    }
}

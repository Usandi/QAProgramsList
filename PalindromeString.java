package Strings;

public class PalindromeString {
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
        if (s.equals(s1)) {
            System.out.println("The "+s+" is Palindrome");
        }
        else {
            System.out.println(s+" is not a Palindrome");
        }
    }
}

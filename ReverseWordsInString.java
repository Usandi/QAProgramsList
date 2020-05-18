package Strings;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String ostring = "This is string";
        String rstring = " ";
        String reverseword = " ";
        String words[] = ostring.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            System.out.println(word);
            char a[] = word.toCharArray();
            char b[] = new char[a.length];
            int c = 0;
            for (int j = a.length-1; j >= 0; j--) {
                b[c++] = a[j];
            }
            reverseword = reverseword+new String(b)+" ";
            System.out.println("reverse word is "+reverseword);
        }
        rstring = rstring+reverseword+" ";
        System.out.println("Original string is "+ostring);
        System.out.println("String with reversed words is "+rstring);
    }
}

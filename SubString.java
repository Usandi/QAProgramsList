package Strings;

public class SubString {
    public static void main(String[] args) {
        String s = "Good morning";
        System.out.println(s);
        String sub = s.substring(5,12);
        System.out.println(sub);
        String s1 = s.replaceAll("morning","evening");

        System.out.println(s1);
    }
}

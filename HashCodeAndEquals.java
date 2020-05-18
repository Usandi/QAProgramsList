package Strings;

public class HashCodeAndEquals {
    public static void main(String[] args) {
        String s = "hashcode";
        String s1 = "hashcode";
        System.out.println("Hashcode of "+s+ " is "+s.hashCode());
        System.out.println("Hashcode of "+s1+ " is "+s1.hashCode());
        if (s.equals(s1)) {
            System.out.println(s+" is same as "+s1+ " using equals method");
        }
        else {
            System.out.println("Not same");
        }
    }
}

package Loops;

public class PrimeNumber {
    public static void main(String[] args) {
        int a = 88;
        if (a%2 != 0 && a%3 != 0 && a%5 !=0 && a%6 !=0 && a%7 != 0 && a%9 !=0) {
            System.out.println(a + " is Prime");
        }
        else {
            System.out.println(a + " is not Prime");
        }
    }
}

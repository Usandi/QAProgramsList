package Loops;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = a+b;
        int count = 15;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i =1; i<=count; i++) {
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a+b;
        }
    }
}

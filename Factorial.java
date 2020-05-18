package Loops;

public class Factorial {
    public static void main(String[] args) {
        int a = 4;
        int f = 1;
        for(int i = 1; i<=a; i++) {
            f = f*i;
        }
        System.out.print("\n"+"Factorial of "+ a + " is " + f);

    }
}

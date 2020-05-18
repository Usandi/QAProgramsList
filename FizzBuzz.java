package Loops;

public class FizzBuzz {
    public static void main(String[] args) {
        int number  = 2;
        if (number%3 == 0) {
            System.out.print("fizz");
        }
        if (number%5 == 0) {
            System.out.println("buzz");
        }
        if (number%3 != 0 && number%5 != 0) {
            System.out.println(number);
        }
    }
}

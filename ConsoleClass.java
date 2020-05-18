package IOHandling;

import java.io.Console;

public class ConsoleClass {
    public static void main(String[] args) {
        Console input = System.console();
        System.out.println("Enter first number to divide ");
        String num1 = input.readLine();
        int a = Integer.parseInt(num1);
        String num2 = input.readLine("Enter another number to divide ");
        int b = Integer.parseInt(num2);
        System.out.println("The division is "+(a/b));
    }
}

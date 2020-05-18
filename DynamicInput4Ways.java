package IOHandling;

import java.io.*;
import java.util.Scanner;

public class DynamicInput4Ways {

    static void DataInputReader() throws IOException {
        DataInputStream dis = new DataInputStream(System.in);

        System.out.println("Enter the first number to multiply ");
        String num1 = dis.readLine();

        System.out.println("Enter the second number to multiply ");
        String num2 = dis.readLine();

        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        System.out.println("Multiplication is "+(a*b));
    }
    static void BuReaderInStrReader() throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        System.out.println("Enter first number to substract ");
        String num1 = br.readLine();
        System.out.println("Enter second number to substract ");
        String num2 = br.readLine();

        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        System.out.println("Substraction is "+(a-b));
    }
    static void ConsoleClass() {
        Console input = System.console();
        System.out.println("Enter first number to divide ");
        String num1 = input.readLine();
        int a = Integer.parseInt(num1);
        String num2 = input.readLine("Enter another number to divide ");
        int b = Integer.parseInt(num2);
        System.out.println("The division is "+(a/b));
    }
    static void ScannerClass() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number--");
        int a = scanner.nextInt();

        System.out.println("Enter another number to add--");
        int b = scanner.nextInt();
        int c = a+b;
        System.out.println("The sum of "+a+ " and "+b+ " is "+c);
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Scanner...");
        ScannerClass();
        System.out.println("DataInpitReader...");
        DataInputReader();
        System.out.println("BufferedReader &...");
        BuReaderInStrReader();
        System.out.println("Console...");
        ConsoleClass();
    }
}

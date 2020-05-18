package IOHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuReaderInStrReader {
    public static void main(String[] args) throws IOException {
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
}

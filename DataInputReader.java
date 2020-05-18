package IOHandling;

import java.io.DataInputStream;
import java.io.IOException;

public class DataInputReader {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);

        System.out.println("Enter the first number to multiply ");
        String num1 = dis.readLine();

        System.out.println("Enter the second number to multiply ");
        String num2 = dis.readLine();

        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        System.out.println("Multiplication is "+(a*b));
    }
}

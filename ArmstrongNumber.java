package Loops;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        int count = 0;
        int armstrongNumber = 0;

        while (number != 0) {
            int a = number%10;
            int b = (int) Math.pow(a,3);
            armstrongNumber += b;
            number = number / 10;
            count += 1;
        }
        System.out.println("The Armstrong number is "+armstrongNumber);
    }
}

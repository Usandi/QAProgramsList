package Loops;

import java.util.Scanner;

public class InputFromcmdLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.next();
        System.out.println("You have entered your name as "+name);
    }
}

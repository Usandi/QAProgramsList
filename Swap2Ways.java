package Loops;

import javax.management.remote.rmi._RMIConnection_Stub;

public class Swap2Ways {

    static void SwapWith3Var(int a, int b) {
        System.out.println("Before swapping ");
        System.out.println("First number is "+a);
        System.out.println("Second number is "+b);
        int c;
        c = b;
        b = a;
        a = c;
        System.out.println("After swapping ");
        System.out.println("First number is "+a);
        System.out.println("Second number is "+b);
    }
    static void SwapWith2Var(int a, int b) {
        System.out.println("Before swapping ");
        System.out.println("First number is "+a);
        System.out.println("Second number is "+b);
        a = a-b;
        b = b+a;
        a = b-a;
        System.out.println("After swapping ");
        System.out.println("First number is "+a);
        System.out.println("Second number is "+b);
    }
    public static void main(String[] args) {
        SwapWith3Var(67,3);
        SwapWith2Var(15,43);
    }

}

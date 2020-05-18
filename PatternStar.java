package Loops;

public class PatternStar {
    public static void main(String[] args) {
        for (int i = 1; i<=6; i++) {
            //System.out.print("i is "+i);
            //System.out.println("*");
            for (int j = i-1; j>=0; j--) {
                //System.out.print("j is "+j);
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

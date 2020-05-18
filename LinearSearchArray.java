package Arrays;

public class LinearSearchArray {
    public static void main(String[] args) {
        int a[] = {3,8,4,6,2};
        int b = 9;

        for (int i=0; i<a.length; i++) {
            if (a[i] == b) {
                System.out.println("The number "+ b + " is found in the array");
            }
        }
    }
}

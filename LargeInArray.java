package Arrays;

public class LargeInArray {
    public static void main(String[] args) {
        int a[] = {23, 18, 44, 80, 6, 2};
        int large = 0;
        int temp = 0;

        for (int i = 0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }

        for (int i = 0; i<a.length; i++) {
            for (int j = 1; j<a.length; j++) {
                if (a[i] > a[j]) {
                    large = a[i];
                }
                else {
                    temp = a[j];
                }
                a[j] = temp;
            }
        }
        System.out.println("\n");
        System.out.print("Largest number is "+large);
    }
}

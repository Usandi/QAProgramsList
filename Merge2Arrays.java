package Arrays;

public class Merge2Arrays {
    public static void main(String[] args) {
        int a[] = {5, 7, 3};
        int b[] = {6, 1, 4, 9};
        int length = a.length + b.length;
        int c[];
        c = new int[length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        int n = a.length;

        for (int j = 0; j < b.length; j++) {
            c[n++] = b[j];
        }

        for (int l=0; l<c.length; l++) {
            System.out.println(c[l]);
        }
    }
}

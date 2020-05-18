package Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int a[] = {3,7,11,8,5,7};
        int temp = 0;
        for (int i = 0; i<a.length; i++) {
            for (int j = i+1; j<a.length; j++) {
                if (a[i] > a[j]) {
                    a[i] = a[i];
                    a[j] = a[j];
                }
                else {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Sorted array is ");
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}

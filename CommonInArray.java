package Arrays;

public class CommonInArray {
    public static void main(String[] args) {
        int a[] = {3,8,4,5,2};
        int b[] = {14,9,5,7,1};

        for (int i=0; i<a.length; i++) {
            for (int j=0; j<b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.print("The common number is "+a[i]);
                }
            }
        }
    }
}

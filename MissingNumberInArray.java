package Arrays;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr={1,2,4,5};

        int n=arr.length+1;
        int sum=n*(n+1)/2;
        int sum2=0;
        for (int i = 0; i < arr.length; i++) {
            sum2+=arr[i];
        }
        int mnumber=sum-sum2;
        System.out.println("The missing number is "+mnumber);
    }
}

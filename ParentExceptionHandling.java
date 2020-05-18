package ExceptionHandling;

public class ParentExceptionHandling {

    static int ParentExceptionHandling() {
        int a = 10;
        int b = 0;
        return a / b;
    }

    public static void main(String[] args) {
        try {
            ParentExceptionHandling();
        } catch (Exception e) {
            System.out.println("You are dividing with zero; which is not possible, provide non-zero number");
        }
    }
}

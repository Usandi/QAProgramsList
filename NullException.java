package ExceptionHandling;

public class NullException {

    public static void main(String[] args) {
        String s[] = null;
        try {
            int i = s.length;
        } catch (Exception e) {
            System.out.println("A null point exception occured");
        } finally {
            System.out.println("Contents of string array "+s);
        }
    }
}

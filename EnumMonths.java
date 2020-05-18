package Collections;

public class EnumMonths {
    enum months {
        January, February, March, April, May, June, August, September, October, November, December
    }
    public static void main(String[] args) {
        for (months m : months.values()) {
            System.out.println(m);
        }
    }
}

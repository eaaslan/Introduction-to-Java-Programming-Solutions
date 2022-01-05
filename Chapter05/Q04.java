package homework.chapter05;

public class Q04 {
    public static void main(String[] args) {
        final double MILE = 1.609;
        System.out.println("Miles     Kilometers");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d%14.2f\n", i, (i * MILE));
        }
    }
}

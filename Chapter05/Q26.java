package homework.chapter05;

public class Q26 {
    public static void main(String[] args) {

        for (double i = 10000; i <= 100000; i += 10000) {
            double before = 1;
            double e = 0;
            for (double j = 1; j <= i; j++) {
                before *= 1 / j;
                e += before;
            }
            System.out.println("e value for i= " + i + " is " + e);
        }
    }
}

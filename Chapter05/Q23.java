package homework.chapter05;

public class Q23 {
    public static void main(String[] args) {

        double num = 0;

        for (double i = 50000.0; i >= 1; i--) {
            num += (1 / i);
        }
        System.out.println("Right to left " + num);

        num = 0;
        for (double i = 1; i <= 50000.0; i++) {
            num += (1 / i);
        }
        System.out.println("Left to right " + num);
    }
}

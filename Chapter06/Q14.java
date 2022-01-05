package homework.chapter06;

public class Q14 {
    public static void main(String[] args) {
        System.out.println("  i       m(i)");
        System.out.println("----------------------");
        for (int i = 1; i <= 900001; i += 100000) {
            System.out.printf("%7d%12.8f\n", i, calculatePI(i));
        }
    }

    public static double calculatePI(int k) {
        double sum = 0;
        for (double i = k; i > 0; i--) {
            sum += Math.pow(-1, i + 1) / (2 * i - 1);
        }
        return 4 * sum;
    }
}

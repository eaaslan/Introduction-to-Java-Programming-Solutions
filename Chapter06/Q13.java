package homework.chapter06;

public class Q13 {
    public static void main(String[] args) {
        sumSeries();
    }

    public static void sumSeries() {
        double sum = 0;
        System.out.println("  i         m(i)");
        System.out.println("----------------------");
        for (double i = 1; i <= 20; i++) {
            sum += (i) / (i + 1);
            System.out.printf("%4.1f\t", i);
            System.out.printf("%8.4f\n", sum);
        }
    }
}

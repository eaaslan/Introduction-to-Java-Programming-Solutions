package homework.chapter05;

public class Q07 {
    public static void main(String[] args) {

        double tuition = 10_000;
        double sum = 0;
        for (int i = 1; i <= 14; i++) {
            tuition *= 1.05;
            System.out.printf("%3d. year the tuition is %.2f\n", i, tuition);
            if (i > 10) {
                sum += tuition;
            }
        }
        System.out.printf("total cost of four years’ worth of tuition after the tenth year: %.2f", sum);
    }
}


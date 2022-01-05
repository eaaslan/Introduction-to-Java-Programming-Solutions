package homework.chapter05;

public class Q25 {
    public static void main(String[] args) {

            double sum = 0;
            for (int d = 1; d <= (2 * 100000 - 1); d += 2) {
                sum += 1. / d;
                d += 2;
                sum -= 1. / d;
                if (((d + 1) / 2) % 10000 == 0)
                    System.out.println("pi value is  " + sum * 4 + " for i = " + d);
            }
    }
}
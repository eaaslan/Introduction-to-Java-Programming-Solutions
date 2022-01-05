package homework.chapter05;
import java.util.Scanner;

public class Q45 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int N = 10;
        double sum = 0;
        double sumOfSquare = 0;

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < N; i++) {
            double number = scanner.nextDouble();
            sum += number;
            sumOfSquare += number * number;
        }
        // kullanıcidan N sayi oku ve topla

        double mean = sum / N;
        double deviation = Math.sqrt((sumOfSquare - ((sum * sum) / N)) / (N - 1));

        System.out.println("The mean is " + mean);
        System.out.println("The standard deviation is " + deviation);
    }
}

package homework.chapter07;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        System.out.print("Enter ten numbers:");
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }
        System.out.print("The mean is ");
        System.out.printf("%1.2f\n", mean(numbers));
        System.out.print("The standard deviation is ");
        System.out.printf("%1.5f", deviation(numbers));

    }

    private static double deviation(double[] numbers) {
        double mean = mean(numbers);
        double deviation = 0;
        for (int i = 0; i < numbers.length; i++) {
            deviation += Math.pow((numbers[i] - mean), 2);
        }
        return Math.pow((deviation / (numbers.length - 1)), 0.5);
    }

    private static double mean(double[] numbers) {
        double sum = 0;
        for (double i : numbers) {
            sum += i;
        }
        return sum / numbers.length;

    }
}
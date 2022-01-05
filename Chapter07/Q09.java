package homework.chapter07;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] array = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextDouble();
        }
        System.out.print("The minimum number is: ");
        System.out.println(min(array));
    }
    public static double min(double[] array) {
        double min = array[0];
        for (double i : array) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }
}

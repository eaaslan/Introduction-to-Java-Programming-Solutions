package homework.chapter07;

import java.util.Scanner;

public class Q30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int[] values = new int[scanner.nextInt()];
        System.out.print("Enter the values: ");
        for (int i = 0; i < values.length; i++)
            values[i] = scanner.nextInt();

        if (isConsecutiveFour(values)) {
            System.out.println("The list has consecutive fours ");
        } else System.out.println("The list has no consecutive fours ");
    }

    public static boolean isConsecutiveFour(int[] values) {
        int counter = 1;
        for (int i = 0; i < values.length - 1; i++) {

            if (values[i] == values[i + 1]) {
                counter++;
            } else {
                counter = 1;
            }

            if (counter >= 4) {
                return true;
            }

        }
        return false;
    }
}

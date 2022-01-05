package homework.chapter05;

import java.util.Optional;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer, the input ends if it is 0: ");
        int num = scanner.nextInt();
        int sum = 0;
        int posN = 0;
        int negN = 0;

        System.out.print("Enter an integer, the input ends if it is 0: ");
        do {
             num = scanner.nextInt();
            if (num > 0) {
                posN++;
            } else {
                negN++;
            }
            sum += num;
        } while (num != 0);

        if (sum == 0) {
            System.out.println("No numbers are entered except 0");
            System.exit(0);
        }

        double average = (double) sum / (posN + negN);
        System.out.println("The total is " + sum);
        System.out.println("The number of positives is " + posN);
        System.out.println("The number of negatives is " + negN);
        System.out.println("The average is " + average);
    }
}

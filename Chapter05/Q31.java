package homework.chapter05;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double interestRate = scanner.nextDouble();
        System.out.print("Enter maturity period (number of months): ");
        double numOfMonth = scanner.nextDouble();

        double total = amount;
        System.out.println("Month   CD Value");
        for (int i = 0; i < numOfMonth; i++) {
            total *= 1 + (interestRate / 1200);
            System.out.printf("%2d", i + 1);
            System.out.printf("%12.2f\n", total);
        }
    }
}

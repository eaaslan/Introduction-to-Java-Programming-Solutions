package homework.chapter05;

import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // arayüz iyilestirilecek
        System.out.print("Enter an amount: ");
        double amount = scanner.nextInt();
        System.out.print("Enter  the annual interest rate: ");
        double interestRate = scanner.nextInt();
        System.out.print("Enter the number of months: ");
        double numOfMonth = scanner.nextInt();

        double monthlyInterestRate = (interestRate / 100) / 12;
        double total = 0;
        for (int i = 0; i < numOfMonth; i++) {
            total = (amount + total) * (1 + monthlyInterestRate);
            System.out.print("Amount: ");
            System.out.printf("%3.2f\n", total);
        }
    }
}

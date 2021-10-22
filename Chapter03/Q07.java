package homework.chapter03;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount of the money: ");
        double money = scanner.nextDouble();

        int totalPennies = (int) (money * 100);
        int dollar = totalPennies / 100;

        if (dollar > 1) {
            System.out.print(dollar + " dollars ");
        } else {
            System.out.print(dollar + "dollar ");
        }

        int pennies = totalPennies % 100;

        if (pennies > 1) {
            System.out.print(pennies + " pennies ");
        } else {
            System.out.print(pennies + " penny ");
        }
    }
}
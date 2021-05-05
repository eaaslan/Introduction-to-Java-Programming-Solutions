/*
(Financial application: compound value) Suppose you save $100 each month
into a savings account with the annual interest rate 5%. Thus, the monthly interest rate is 0.05/12 = 0.00417. After the first month, the value in the account
becomes
100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes
(100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes
(100 + 201.252) * (1 + 0.00417) = 302.507
and so on.
Write a program that prompts the user to enter a monthly saving amount and
displays the account value after the sixth month. (In Exercise 5.30, you will use a
loop to simplify the code and display the account value for any month.)
 */
package homework.chapter02;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double amount = scanner.nextDouble();

        final double MONTHLY_INTEREST_RATE = 0.00417;
        double total = 0;

        total = (amount + total) * (1 + MONTHLY_INTEREST_RATE);
        total = (amount + total) * (1 + MONTHLY_INTEREST_RATE);
        total = (amount + total) * (1 + MONTHLY_INTEREST_RATE);
        total = (amount + total) * (1 + MONTHLY_INTEREST_RATE);
        total = (amount + total) * (1 + MONTHLY_INTEREST_RATE);
        total = (amount + total) * (1 + MONTHLY_INTEREST_RATE);

        System.out.printf("After the sixth month, the account value is $ %.2f", total);
    }
}

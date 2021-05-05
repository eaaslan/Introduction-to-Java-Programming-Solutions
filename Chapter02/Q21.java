/*
(Financial application: calculate future investment value) Write a program that
reads in investment amount, annual interest rate, and number of years, and displays the future investment value using the following formula:
futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12
For example, if you enter amount 1000, annual interest rate 3.25%, and number
of years 1, the future investment value is 1032.98.
 */
package homework.chapter02;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double interestRate = scanner.nextDouble();
        System.out.print("Enter number of years: ");
        double years = scanner.nextDouble();
        interestRate /= 1200;
        double value = amount * (Math.pow((1 + interestRate), years * 12)); //// 12 month * percent (100)

        System.out.printf("Accumulated value is $%.2f", value);
    }
}

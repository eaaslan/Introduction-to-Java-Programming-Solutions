/*
(Convert pounds into kilograms) Write a program that converts pounds into kilograms. The program prompts the user to enter a number in pounds, converts it
to kilograms, and displays the result. One pound is 0.454 kilograms.
 */
package homework.chapter02;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double KILOGRAM_PER_POUND = 0.454;

        System.out.print("Enter a number in pounds: ");
        double pounds = scanner.nextDouble();
        double kilograms = pounds * KILOGRAM_PER_POUND;

        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
}

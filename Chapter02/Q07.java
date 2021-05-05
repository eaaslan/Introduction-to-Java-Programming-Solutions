/*
(Find the number of years) Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the number of years and days for the minutes. For simplicity, assume a year has 365 days.
 */
package homework.chapter02;
import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int minutes = scanner.nextInt();

        int years = minutes / (60 * 24 * 365);
        int days = (minutes % (60 * 24 * 365)) / (60 * 24);

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");

    }
}

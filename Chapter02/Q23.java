/*
(Cost of driving) Write a program that prompts the user to enter the distance to
drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
and displays the cost of the trip.
 */
package homework.chapter02;
import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double x = scanner.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double y = scanner.nextDouble();
        System.out.print("Enter price per gallon: ");
        double z = scanner.nextDouble();

        double cost = (x / y) * z;
        System.out.printf("The cost of driving is $ %.2f", cost);
    }
}

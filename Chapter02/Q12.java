/*
(Physics: finding runway length) Given an airplane’s acceleration a and take-off
speed v, you can compute the minimum runway length needed for an airplane to
take off using the following formula:
(length = v*2/2a)
Write a program that prompts the user to enter v in meters/second (m/s) and the
acceleration a in meters/second squared (m/s2
), and displays the minimum runway length.
 */
package homework.chapter02;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double speed = scanner.nextDouble();
        double acceleration = scanner.nextDouble();

        double length = Math.pow(speed, 2) / (2 * acceleration);

        System.out.printf("The minimum runway length for this airplane is %.3f ", length);
    }
}

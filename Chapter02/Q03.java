/*
(Convert feet into meters) Write a program that reads a number in feet, converts it
to meters, and displays the result. One foot is 0.305 meter.
 */
package homework.chapter02;
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double FOOT_PER_METER = 0.305;

        System.out.print("Enter value for feet: ");
        double feet = scanner.nextDouble();
        double meters = FOOT_PER_METER * feet;

        System.out.println(feet + " feet is " + meters + " meters");
    }
}



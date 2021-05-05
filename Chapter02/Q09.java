/*
(Physics: acceleration) Average acceleration is defined as the change of velocity
divided by the time taken to make the change, as shown in the following formula:
(a = v1 - v0 / t )
Write a program that prompts the user to enter the starting velocity v0 in meters/
second, the ending velocity v1 in meters/second, and the time span t in seconds,
and displays the average acceleration.
 */
package homework.chapter02;
import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter v0, v1, and t: ");

        float v0 = scanner.nextFloat();
        float v1 = scanner.nextFloat();
        float t = scanner.nextFloat();
        float avg = ((v1 - v0) / t);

        System.out.printf("The average acceleration is %.4f", avg);
    }
}

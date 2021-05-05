/*
(Geometry: area of a hexagon) Write a program that prompts the user to enter the
side of a hexagon and displays its area.
 */
package homework.chapter02;
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = scanner.nextFloat();
        double areaOfHex = ((3 * Math.sqrt(3)) / 2) * Math.pow(side, 2);

        System.out.printf("The area of the hexagon is %.4f", areaOfHex);
    }
}

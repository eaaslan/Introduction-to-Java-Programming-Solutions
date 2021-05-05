/*
(Compute the volume of a cylinder) Write a program that reads in the radius
and length of a cylinder and computes the area and volume using the following
formulas:
area = radius * radius * p
volume = area * length
 */
package homework.chapter02;
import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = scanner.nextDouble();
        double length = scanner.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.printf("The area is %.4f \n", area);
        System.out.printf("The volume is %.1f" , volume);
    }
}

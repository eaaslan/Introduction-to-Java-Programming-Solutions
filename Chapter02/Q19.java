/*
(Geometry: area of a triangle) Write a program that prompts the user to enter
three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.
 */
package homework.chapter02;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points for a triangle: ");
        double side1x = input.nextDouble();
        double side1y = input.nextDouble();
        double side2x = input.nextDouble();
        double side2y = input.nextDouble();
        double side3x = input.nextDouble();
        double side3y = input.nextDouble();

        double side1 = Math.pow((Math.pow((side2x - side1x), 2) + Math.pow((side2y - side1y), 2)), 0.5);
        double side2 = Math.pow((Math.pow((side3x - side2x), 2) + Math.pow((side3y - side2y), 2)), 0.5);
        double side3 = Math.pow((Math.pow((side1x - side3x), 2) + Math.pow((side1y - side3y), 2)), 0.5);

        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);

        System.out.printf("The area of the triangle is %.1f", area);
    }
}




package homework.chapter06;

import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of side: ");
        int numOfSide = scanner.nextInt();
        System.out.print("Enter the side: ");
        double side = scanner.nextDouble();
        System.out.println("The area of the polygon is " + area(numOfSide, side));
    }

    public static double area(int n, double side) {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
}
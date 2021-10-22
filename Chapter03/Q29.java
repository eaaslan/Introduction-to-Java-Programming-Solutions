package homework.chapter03;

import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter r1's center x-, y-coordinates, radius: ");
        double r1x = scanner.nextDouble();
        double r1y = scanner.nextDouble();
        double r1 = scanner.nextDouble();

        System.out.print("Enter r2's center x-, y-coordinates, radius: ");
        double r2x = scanner.nextDouble();
        double r2y = scanner.nextDouble();
        double r2 = scanner.nextDouble();

        double pow = Math.pow(Math.pow(r2x - r1x, 2) + Math.pow(r2y - r1y, 2), 0.5);

        if (pow <= Math.abs(r1 - r2)) {
            System.out.println("circle2 is inside circle1");
        } else if (pow <= r1 + r2) {
            System.out.println("circle2 overlaps circle1 ");
        } else {
            System.out.println("circle2 does not overlap circle1");
        }
    }
}

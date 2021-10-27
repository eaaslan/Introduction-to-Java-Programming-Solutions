package homework.chapter04;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double p1latitude = scanner.nextDouble();
        double p1longitude = scanner.nextDouble();
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double p2latitude = scanner.nextDouble();
        double p2longitude = scanner.nextDouble();

        final double RADIUS = 6371.01;

        double x1 = Math.toRadians(p1latitude);
        double y1 = Math.toRadians(p1longitude);
        double x2 = Math.toRadians(p2latitude);
        double y2 = Math.toRadians(p2longitude);

        double d = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) *
                Math.cos(x2) * Math.cos(y1 - y2));

        System.out.println("The distance between the two points is " + d);
    }
}

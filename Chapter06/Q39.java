package homework.chapter06;

import java.util.Scanner;

public class Q39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = scanner.nextDouble();
        double y0 = scanner.nextDouble();
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.print("(" + x2 + "," + y2 + ")");
        if (onTheLineSegment(x0, y0, x1, y1, x2, y2)) {
            System.out.print("line segment ");
        } else if (leftOfTheLine(x0, y0, x1, y1, x2, y2)) {
            System.out.print(" is on the left side of the line");
        } else if (onTheSameLine(x0, y0, x1, y1, x2, y2)) {
            System.out.print(" is on the same line");
        } else {
            System.out.print(" is on the right side of the line");
        }
        System.out.print(" from " + "(" + x0 + ", " + y0 + ")" + " to " + "(" + x1 + ", " + y1 + ")");
    }

    private static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) == 0;
    }

    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) > 0;
    }

    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
        return (((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) == 0 && ((x2 > x0) && (y2 > y0) && (x2 < x1) && (y2 < y1)));
    }
}
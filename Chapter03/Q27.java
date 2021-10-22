package homework.chapter03;

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a point's x- and y-coordinates:");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        System.out.print("The points is ");
        if (!((y > 0) && (x > 0) && (x + 2 * y < 200))) System.out.print(" not ");

        System.out.print("in the triangle");

    }

}

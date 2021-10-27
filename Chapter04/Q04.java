package homework.chapter04;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double length = scanner.nextDouble();

        double area = (6 * length * length) / (4 * Math.tan(Math.PI / 6));

        System.out.println("The area of the hexagon is " + area);
    }
}
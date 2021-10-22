package homework.chapter03;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.print("Point (" + x + "," + y + ") is ");
        if (distance <= 10) {
            System.out.println("in the circle");
        } else {
            System.out.println("is not in the circle");
        }
    }
}

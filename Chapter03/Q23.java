package homework.chapter03;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.print("Point (" + x + "," + y + ") ");

        if (x < 5) {
                if (y < 5 / 2.0) {
                System.out.println("is in the rectangle");
            } else{
                System.out.println("is not in the rectangle");
            }
        } else{
            System.out.println("is not in the rectangle");
        }
    }
}

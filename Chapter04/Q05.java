package homework.chapter04;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        double n = scanner.nextDouble();
        System.out.print("Enter the side: ");
        double s = scanner.nextDouble();

        double area = (n * s * s) / (4 * Math.tan(Math.PI / n));
        
        System.out.println("The area of the polygon is " + area);
    }
}

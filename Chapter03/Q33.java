package homework.chapter03;

import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight and price for package 1: ");
        double weight = scanner.nextDouble();
        double price = scanner.nextDouble();
        System.out.println("Enter weight and price for package 2: ");
        double weight1 = scanner.nextDouble();
        double price1 = scanner.nextDouble();

        if (price / weight > price1 / weight1) {
            System.out.println("Package 2 has a better price");
        } else if (price1 / weight1 > price / weight) {
            System.out.println("Package 1 has a better price");
        } else {
            System.out.println("Two packages have the same price.");
        }
    }
}

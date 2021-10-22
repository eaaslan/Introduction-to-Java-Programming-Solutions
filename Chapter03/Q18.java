package homework.chapter03;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the weight of the package in pounds: ");
        double weight = scanner.nextDouble();

        if (weight > 0 && weight <= 1) {
            System.out.println("The cost is 3.5 $");
        } else if (weight <= 3) {
            System.out.println("The cost is 5.5 $");
        } else if (weight <= 10) {
            System.out.println("The cost is 8.5 $");
        } else if (weight <= 20) {
            System.out.println("The cost is 8.5 $");
        } else {
            System.out.println("The package cannot be shipped");
        }
    }
}
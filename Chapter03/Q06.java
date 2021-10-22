package homework.chapter03;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter feet: ");
        double feet = scanner.nextDouble();
        System.out.println("Enter inches: ");
        double inch = scanner.nextDouble();

        final double KILOGRAMS_PER_POUNDS = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        final double INCH_PER_FEET = 12;

        inch += feet * INCH_PER_FEET;
        double meters = inch * METERS_PER_INCH;
        double kilograms = KILOGRAMS_PER_POUNDS * weight;

        double BMI = kilograms / Math.pow(meters, 2);

        System.out.println("BMI is "+BMI);

        if (BMI > 30) {
            System.out.println("Obese");
        } else if (BMI > 20) {
            System.out.println("Normal");
        } else
            System.out.println("Thin");
    }
}

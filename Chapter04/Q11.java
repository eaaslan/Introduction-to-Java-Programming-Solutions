package homework.chapter04;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = scanner.nextInt();

        if (decimal >= 10 && decimal <= 15) {
            char hexChar = (char) (decimal - 10 + 'A');
            System.out.print("The hex value is " + hexChar);
        } else if (decimal < 10) {
            System.out.println("The hex value is " + decimal);
        } else {
            System.out.println(decimal + " is an invalid input");
        }
    }
}

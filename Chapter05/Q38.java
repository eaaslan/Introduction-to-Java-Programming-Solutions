package homework.chapter05;

import java.util.Scanner;

public class Q38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the decimal value: ");
        int dec = scanner.nextInt();

        String octal = "";

        for (int i = dec; i > 0; i /= 8) {

            octal = (i % 8) + octal;

        }
        System.out.println("Decimal: "+dec+ " Octal: "+octal);

    }
}

package homework.chapter05;

import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for converting to binary ");
        int dec = scanner.nextInt();

        String binary = "";

        for (int i = dec; i > 0; i /= 2) {
            binary = (i % 2) + binary;
        }
        System.out.println(binary);
    }
}

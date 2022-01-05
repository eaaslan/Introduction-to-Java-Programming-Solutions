package homework.chapter05;

import java.util.Scanner;

public class Q47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first 12 digits of an ISBN-13 as a string:");
        String isbn = scanner.nextLine();

        if (isbn.length() != 12) {
            System.out.println(isbn + " is an invalid input");
            System.exit(0);
        }

        int checksum = 0;
        for (int i = 1; i <= 12; i++) {
            // int checksum1 = Integer.parseInt(isbn.charAt(i - 1) + "");

            int checksum1 = isbn.charAt(i - 1) - '0';
            if (i % 2 == 0) {
                checksum += 3 * checksum1; //char to string
            } else {
                checksum += checksum1;
            }
        }
        checksum = 10 - checksum % 10;
        System.out.print("The ISBN-13 number is ");
        if (checksum == 10) {
            isbn += "0";
        } else {
            isbn += checksum;
        }
        System.out.println(isbn);
    }
}

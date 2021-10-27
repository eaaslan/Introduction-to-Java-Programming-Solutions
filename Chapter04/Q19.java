package homework.chapter04;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String isbn = scanner.nextLine();

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int d1 = Integer.parseInt(isbn.substring(0, 1));
        int d2 = Integer.parseInt(isbn.substring(1, 2));
        int d3 = Integer.parseInt(isbn.substring(2, 3));
        int d4 = Integer.parseInt(isbn.substring(3, 4));
        int d5 = Integer.parseInt(isbn.substring(4, 5));
        int d6 = Integer.parseInt(isbn.substring(5, 6));
        int d7 = Integer.parseInt(isbn.substring(6, 7));
        int d8 = Integer.parseInt(isbn.substring(7, 8));
        int d9 = Integer.parseInt(isbn.substring(8, 9));

        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5
                + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        System.out.print("The ISBN-10 number is " + isbn);

        if (d10 == 10)
            System.out.print("X"); // add X to the end of the digit without line
        else
            System.out.print(d10);

    }
}



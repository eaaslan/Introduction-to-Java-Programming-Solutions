package homework.chapter05;

import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int isbn = scanner.nextInt();

        int d10 = 0;
        for (int i = 1; i <= 9; i++) {
            d10 += i * (isbn % ((int) (Math.pow(10, (10 - i))))
                    / ((int) Math.pow(10, (9 - i))));

        }
        System.out.println(d10);
        d10 = d10 % 11;
        System.out.print("The ISBN-10 number is " + isbn);
        if (d10 == 10)
            System.out.print("X"); // add X to the end of the digit without line
        else
            System.out.print(d10);
    }
}


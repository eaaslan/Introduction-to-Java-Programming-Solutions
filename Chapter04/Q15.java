package homework.chapter04;

import kotlin.ranges.CharRange;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String letter = scanner.nextLine();
        char s = letter.toUpperCase().charAt(0);

        if (Character.isLetter(s)) {
            System.out.print("The corresponding number is ");
            if (s >= 'W') {
                System.out.println("9");
            } else if (s >= 'T') {
                System.out.println("8");
            } else if (s >= 'P') {
                System.out.println("7");
            } else if (s >= 'M') {
                System.out.println("6");
            } else if (s >= 'J') {
                System.out.println("5");
            } else if (s >= 'G') {
                System.out.println("4");
            } else if (s >= 'D') {
                System.out.println("3");
            } else if (s >= 'A') {
                System.out.println("2");
            }
        } else {
            System.out.println(s + " is an invalid input");
        }
    }
}

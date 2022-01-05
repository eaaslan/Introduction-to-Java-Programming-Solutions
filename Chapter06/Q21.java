package homework.chapter06;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String letter = scanner.nextLine();
        char s = letter.toUpperCase().charAt(0);
        for (int i = 0; i <= letter.length() - 1; i++) {
            if (Character.isLetter(letter.charAt(i))) {
                letter(letter.toUpperCase().charAt(i));
            } else {
                System.out.print(letter.charAt(i));
            }
        }
    }

    public static void letter(char c) {
        if (Character.isLetter(c)) {
            if (c >= 'W') {
                System.out.print("9");
            } else if (c >= 'T') {
                System.out.print("8");
            } else if (c >= 'P') {
                System.out.print("7");
            } else if (c >= 'M') {
                System.out.print("6");
            } else if (c >= 'J') {
                System.out.print("5");
            } else if (c >= 'G') {
                System.out.print("4");
            } else if (c >= 'D') {
                System.out.print("3");
            } else if (c >= 'A') {
                System.out.print("2");
            }
        } else {
            System.out.print(c + " is an invalid input");
        }
    }
}
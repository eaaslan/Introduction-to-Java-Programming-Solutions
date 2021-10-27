package homework.chapter04;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter : ");
        String letter = scanner.nextLine();

        char s = Character.toUpperCase(letter.charAt(0));

        if ('A' <= s && s <= 'Z') {
            switch (s) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                    System.out.println(letter + " is a vowel ");
                    break;
                default:
                    System.out.println(letter + " is a consonant");
                    break;
            }
        } else {
            System.out.println(letter + " is an invalid input");
        }
    }
}

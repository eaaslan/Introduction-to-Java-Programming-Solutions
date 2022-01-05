package homework.chapter06;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        System.out.println("Number of letters in the string is: " + countLetters(s));
    }

    public static int countLetters(String s) {
        int LetterCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                LetterCounter++;
            }
        }
        return LetterCounter;
    }
}

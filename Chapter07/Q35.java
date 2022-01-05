package homework.chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = {"dolphin", "lion", "panda", "penguin"};
        char choose = 'y';
        while (choose != 'n') {

            hangman(words);

            System.out.print("Do you want to guess another word? Enter y or n: ");
            choose = scanner.nextLine().charAt(0);
            while (!(choose == 'n' || choose == 'y')) {
                System.out.print("Please enter only y or n: ");
                choose = scanner.nextLine().charAt(0);
            }
        }
    }

    static void hangman(String[] words) {
        Scanner scanner = new Scanner(System.in);
        String randomWord = words[(int) (Math.random() * words.length)];
        char[] word = randomWord.toCharArray();

        char[] unknown = new char[randomWord.length()];
        Arrays.fill(unknown, '*');

        int missCounter = 0;
        // System.out.println(word);
        while (true) {

            System.out.print("(Guess) Enter a letter in word ");
            System.out.println(unknown);
            char guess = scanner.nextLine().charAt(0);

            boolean found = false;
            for (int i = 0; i < word.length; i++) {
                if (unknown[i] == guess) {
                    System.out.println(unknown[i] + " is already in the word");
                    break;
                }

                if (word[i] == guess) {
                    unknown[i] = word[i];
                    found = true;
                }
            }

            if (found == false) {
                System.out.println(guess + " is not in the word");
                missCounter++;
            }

            System.out.println(unknown);
            if (Arrays.equals(unknown, word)) {
                System.out.print("The word is ");
                System.out.print(word);
                System.out.println(". You missed " + missCounter + " time");
                break;
            }
        }
    }
}

package homework.chapter05;

import java.util.Scanner;

public class Q49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String withoutSpace = input.toLowerCase().replace(" ", "");
        int numOfVowels = 0;
        int numOfConsonants = 0;

        for (int i = 0; i < withoutSpace.length(); i++) {

            char ch = withoutSpace.charAt(i);

            if (Character.isLetter(ch))
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    numOfVowels++;
                } else {
                    numOfConsonants++;
                }
        }
        System.out.println("The number of vowels is " + numOfVowels);
        System.out.println("The number of consonants is " + numOfConsonants);
    }
}

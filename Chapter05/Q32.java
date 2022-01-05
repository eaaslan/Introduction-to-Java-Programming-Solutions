package homework.chapter05;

import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guess = scanner.nextInt();

        int lottery = 0;
        int digit1 = 0;
        int digit2 = 0;
        do {
            lottery = ((int) (Math.random() * 90) + 10);
            digit1 = (lottery / 10);
            digit2 = (lottery % 10);
        } while (digit1 != digit2);

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottery number is " + lottery);

        // Check the guess
        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        else if (guessDigit2 == digit1
                && guessDigit1 == digit2)
            System.out.println("Match all digits: you win $3,000");
        else if (guessDigit1 == digit1
                || guessDigit1 == digit2
                || guessDigit2 == digit1
                || guessDigit2 == digit2)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");
    }
}


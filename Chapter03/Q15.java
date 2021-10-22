package homework.chapter03;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lottery = (int) (Math.random() * 900) + 100;

        System.out.print("Enter the three digits lottery ticket");
        int guess = scanner.nextInt();

        int guessD1 = guess / 100; //extract digits
        int guessD2 = (guess % 100) / 10;
        int guessD3 = (guess % 10);

        int lotDigit1 = lottery / 100; //extract digits
        int lotDigit2 = (lottery % 100) / 10;
        int lotDigit3 = (lottery % 10);

        System.out.println("Your guess is: " + guess + " Lottery number is: " + lottery);
        if (lottery == guess) {
            System.out.println("You won 10,000 $");
        } else if ((guessD1 == lotDigit2 && guessD2 == lotDigit3 && guessD3 == lotDigit1) || (guessD1 == lotDigit3 && guessD2 == lotDigit1 && guessD3 == lotDigit2) ||
                (guessD1 == lotDigit3 && guessD2 == lotDigit2 && guessD3 == lotDigit1) || (guessD1 == lotDigit2 && guessD2 == lotDigit1 && guessD3 == lotDigit3))
            // TODO eksik
        //match all digit
        {
            System.out.println("You won 3,000 $");
        }
        //match one digit
        else if ((guessD1 == lotDigit1) || (guessD1 == lotDigit2) || (guessD1 == lotDigit3) || (guessD2 == lotDigit1) || (guessD2 == lotDigit2)
                || (guessD2 == lotDigit3) || (guessD3 == lotDigit1) || (guessD3 == lotDigit2) || (guessD3 == lotDigit3)) {
            System.out.println("You won 1,000 $");
        } else {
            System.out.println("you didnt get anything");
        }
    }
}

/*
123

132
213
231
312
321
 */


package homework.chapter06;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a credit card number as a long integer: ");
        long number = scanner.nextLong();
        if (isValid(number))
            System.out.println(number + " is valid");
        else
            System.out.println(number + " is invalid");
    }

    public static boolean isValid(long number) {
        if ((13 > getSize(number) || getSize(number) > 16))
            return false;

        if (!prefixMatched(number, 4) && !prefixMatched(number, 5) && !prefixMatched(number, 37) && !prefixMatched(number, 6)) {
            return false;
        }

        return (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0;
    }

    public static int sumOfDoubleEvenPlace(long number) {
        String cardSize = number + "";
        int sum = 0;
        if (cardSize.length() % 2 == 0) {
            for (int i = 1; i <= cardSize.length() / 2; i++) {
                number /= 10;
                sum += (getDigit((int) (number % 10)));
                number /= 10;
            }
        }
        return sum;
    }

    public static int getDigit(int number) {
        int sumOfDigits = 0;
        int twoDigitNum = number * 2;
        if (number * 2 >= 10) {
            sumOfDigits += (twoDigitNum) % 10;
            twoDigitNum /= 10;
            sumOfDigits += (twoDigitNum) % 10;
            return sumOfDigits;
        }
        return number * 2;
    }

    public static int sumOfOddPlace(long number) {
        String cardSize = number + "";
        int sum = 0;
        if (cardSize.length() % 2 == 0) {
            for (int i = 1; i <= cardSize.length() / 2; i++) {
                sum += (number % 10);
                number /= 10;
                number /= 10;
            }
        }
        return sum;
    }

    public static int getSize(long number) {
        String card = number + "";
        if (13 <= card.length() && card.length() <= 16) {
            return card.length();
        }
        return -1;
    }

    /**
     * Return true if the digit d is a prefix for number
     */
    public static boolean prefixMatched(long number, int d) {
        // içi yazılacak
        return false;
    }

    /**
     * Return the first k number of digits from number. If the
     * number of digits in number is less than k, return  number.
     */
    public static long getPrefix(long number, int k) {
        return 0;
    }
}


package homework.chapter06;
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scanner.nextInt();

        System.out.println(isPalindrome(num));
    }

    public static boolean isPalindrome(int number) {
        return (number == reverse(number));
    }

    public static int reverse(int number) {
        String str = number + "";
        String newNumber = "";
        for (int i = str.length(); i > 0; i--) {
            newNumber += str.charAt(i - 1); //  concatenation ne demek ?
        }
        return Integer.parseInt(newNumber);
    }

    public static int reverse2(int number) {
        int reverseNumber = 0;

        while(number > 0) {
            reverseNumber = reverseNumber * 10 + number % 10;
            number /= 10;
        }

        return reverseNumber;
    }
}

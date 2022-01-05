package homework.chapter06;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number ");
        int num = scanner.nextInt();

        System.out.println("Sum of the digits is: " + sumDigits(num));
    }

    public static int sumDigits2(long n) {
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int sumDigits(long n) {
        String numberStr = String.valueOf(n);
        int sum = 0;
        for (long i = 0; i < numberStr.length(); i++) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}

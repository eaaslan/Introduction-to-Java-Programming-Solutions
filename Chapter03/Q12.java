package homework.chapter03;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int num1 = scanner.nextInt();

        if (num1 / 100 == num1 % 10)
            System.out.println(num1 + " is a palindrome");
        else
            System.out.println(num1 + " is not a palindrome");
    }
}

/*
(Sum the digits in an integer) Write a program that reads an integer between 0 and
1000 and adds all the digits in the integer. For example, if an integer is 932, the
sum of all its digits is 14.
Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
 */
package homework.chapter02;
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number between 0 and 1000 ");
        int num = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += num % 10;
            num = num / 10;

        }
        System.out.println("The sum of the digits is " + sum);
    }
}

/*
(Financial application: monetary units) Rewrite Listing 2.10, ComputeChange
.java, to fix the possible loss of accuracy when converting a double value to an
int value. Enter the input as an integer whose last two digits represent the cents.
For example, the input 1156 represents 11 dollars and 56 cents
 */
package homework.chapter02;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cents");
        int x = scanner.nextInt();

        int cent = x % 100;
        int dollar = x / 100;

        System.out.println(dollar + " dollar " + cent + " cent");
    }
}

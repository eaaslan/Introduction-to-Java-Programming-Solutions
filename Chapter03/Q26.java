package homework.chapter03;

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        System.out.println("is " + num + " divisible by 5 and 6? " + (num % 6 == 0 && num % 5 == 0));
        System.out.println("is " + num + " divisible by 5 or 6? " + ((num % 6 == 0 || num % 5 == 0)));
        System.out.println("is " + num + " divisible by 5 or 6 ,bot not both? " + ((num % 6 == 0 ^ num % 5 == 0)));
    }
}
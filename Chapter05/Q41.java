package homework.chapter05;

import java.util.Scanner;

public class Q41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        int max = scanner.nextInt();
        int count = 1;

        while (true) {
            int num1 = scanner.nextInt();

            if (num1 > max) {
                count = 1;
                max = num1;
            } else if (num1 == max) {
                count++;
            }
            if (num1 == 0) {
                break;
            }
        }
        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);
    }
}


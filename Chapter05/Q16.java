package homework.chapter05;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int bolen = 2;

        while (number / bolen != 1) {
            if (number % bolen == 0) {
                System.out.print(bolen + ",");
                number = number / bolen;
            } else {
                bolen++;
            }
        }

        System.out.println(number);
    }
}
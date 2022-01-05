package homework.chapter05;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 2; i < 8; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 7; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


        for (int j = 1; j < 7; j++) {  // num of columns
            for (int k = 6 - j; k >= 1; k--) { // reduce two for one space and one number
                System.out.print("  ");
            }
            for (int i = j; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }


        int space = 7;
        for (int i = 0; i < 6; i++) {
            for (int s = 0; s < i; s++) {
                System.out.print("  ");
            }

            for (int j = 1; j < 7 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}


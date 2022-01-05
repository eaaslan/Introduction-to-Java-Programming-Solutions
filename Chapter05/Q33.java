package homework.chapter05;

import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {

        int num = 10_000;
        System.out.print("The perfect numbers between 0 and 10.000 are: ");
        for (int i = 1; i < num; i++) {
            int divisors = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    divisors += j;
                }
            }
            if (i == divisors) {
                System.out.print(" "+i);
            }
        }
    }
}

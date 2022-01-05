package homework.chapter05;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two number ");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int d = Math.min(sayi1, sayi2);
        int obeb = 0;

        while (d >= 1) {
            if (sayi1 % d == 0 && sayi2 % d == 0) {
                obeb = d;
                break;
            }
            d--;
        }
        System.out.println("Greatest common divisor is " + obeb);
    }
}

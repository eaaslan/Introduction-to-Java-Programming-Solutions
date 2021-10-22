package homework.chapter03;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ran1 = (int) (Math.random() * 100);
        int ran2 = (int) (Math.random() * 100);

        System.out.println(ran1 + "-" + ran2 + "=?");

        int guess = scanner.nextInt();

        if (ran1 - ran2 == guess)
            System.out.println("True");
        else
            System.out.println("False");
    }
}

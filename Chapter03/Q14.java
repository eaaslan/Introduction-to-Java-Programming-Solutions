package homework.chapter03;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Heads or tails ? (0 is heads and 1 is tails");
        int guess = scanner.nextInt();

        int random = Math.random() <= 0.5 ? 0 : 1;

        if (random == guess)
            System.out.println("True");
        else
            System.out.println("False");
    }
}

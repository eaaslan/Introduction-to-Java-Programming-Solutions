package homework.chapter03;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("scissor (0), rock (1), paper (2): ");
        int guess = scanner.nextInt();

        int ran = (int) (Math.random() * 3);

        System.out.print(" The computer is " + ran + " You are " + guess);
        if ((guess == 0 && ran == 2) || (guess == 1 && ran == 0) || (guess == 2 && ran == 1)) {
            System.out.println(". You won");
        } else if ((guess == 0 && ran == 1) || (guess == 1 && ran == 2) || (guess == 2 && ran == 0)) {
            System.out.println(". You lost");
        } else {
            System.out.println(". It is a draw");
        }
    }
}

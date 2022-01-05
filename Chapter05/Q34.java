package homework.chapter05;

import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("scissor (0), rock (1), paper (2): ");

        int playerWin = 0;
        int computerWin = 0;
        int ran = (int) (Math.random() * 3);

        while (Math.abs(playerWin - computerWin) <= 1) {
            int guess = scanner.nextInt();
            System.out.print(" The computer is " + ran + " You are " + guess);
            if ((guess == 0 && ran == 2) || (guess == 1 && ran == 0) || (guess == 2 && ran == 1)) {
                System.out.println(". You won");
                playerWin++;
            } else if ((guess == 0 && ran == 1) || (guess == 1 && ran == 2) || (guess == 2 && ran == 0)) {
                System.out.println(". You lost");
                computerWin++;
            } else {
                System.out.println(". It is a draw");
            }
            System.out.println("Your score is " + playerWin + " and the computer score is " + computerWin);
        }
    }
}



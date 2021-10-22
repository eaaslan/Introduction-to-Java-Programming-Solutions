package homework.chapter03;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int random1 = (int) (Math.random() * 10);
        int random2 = (int) (Math.random() * 10);
        int random3 = (int) (Math.random() * 10);

        int sum = random1 + random2 + random3;
        System.out.print(random1 + "+" + random2 + "+" + random3 + " = ? ");

        int guess = scanner.nextInt();

        if (guess == sum) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

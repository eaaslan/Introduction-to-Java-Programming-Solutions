package homework.chapter04;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an ASCII code: ");
        int ascii = scanner.nextInt();

        System.out.println("The character for ASCII code " + ascii + " is " + (char) (ascii));
    }
}

package homework.chapter04;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0); // or String s = scanner.nextLine(); char ch = s.charAt(0);
        System.out.println("The Unicode for the character " + ch + " is " + (int) ch);
    }
}

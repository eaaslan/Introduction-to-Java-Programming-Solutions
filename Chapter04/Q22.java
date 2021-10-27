package homework.chapter04;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string s1: ");
        String st1 = scanner.nextLine();
        System.out.print("Enter string s1: ");
        String st2 = scanner.nextLine();

        if (st1.contains(st2))
            System.out.println(st2 + " is a substring of " + st1);
        else
            System.out.println(st2 + " is not a substring of " + st1);
    }
}

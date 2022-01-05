package homework.chapter05;

import java.util.Scanner;

public class Q51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        String prefix = "";
        int min = Math.min(string1.length(), string2.length());
        for (int i = 0; i < min; i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
                break;
            }
            prefix += string1.charAt(i);
        }
        if (prefix.length() < 2) {
            System.out.println(string1 + " and " + string2 + " have no common prefix ");
            System.exit(0);
        } else {
            System.out.println("The common prefix is " + "''" + prefix + "''");
        }

    }
}
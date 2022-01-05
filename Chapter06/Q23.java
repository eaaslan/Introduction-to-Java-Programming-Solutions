package homework.chapter06;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter a letter: ");
        char a = scanner.nextLine().charAt(0);
        System.out.println("the number of occurrences of the character in the string is: " + count(str, a));
    }

    public static int count(String str, char a) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (a == str.charAt(i)) {
                counter++;
            }
        }
        return counter;
    }
}

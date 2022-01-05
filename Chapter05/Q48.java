package homework.chapter05;

import java.util.Scanner;

public class Q48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String newString = "";

        for (int i = 0; i < input.length(); i++) {

            if ((i + 1) % 2 != 0) {
                newString += input.charAt(i) + "";
            }
        }
        System.out.println(newString);
    }
}

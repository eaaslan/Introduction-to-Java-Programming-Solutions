package homework.chapter05;

import java.util.Scanner;

public class Q50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String withoutSpace = input.replace(" ", "");
        int upperCounter = 0;

        for (int i = 0; i < withoutSpace.length(); i++) {
            if (withoutSpace.charAt(i) == withoutSpace.toUpperCase().charAt(i)) {
                upperCounter++;
            }
        }
        System.out.println("The number of uppercase letters is " + upperCounter);
    }
}

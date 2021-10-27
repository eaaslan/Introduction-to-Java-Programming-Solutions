package homework.chapter04;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        System.out.println("String has " + string.length() + " length " + "and the first character is " + string.charAt(0));
    }
}

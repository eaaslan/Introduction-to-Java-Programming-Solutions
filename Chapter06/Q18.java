package homework.chapter06;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ■ A password must have at least eight characters.\n" +
                " ■ A password consists of only letters and digits.\n" +
                " ■ A password must contain at least two digits.");
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        if (validPasswordSize(password) && isLettersOrDigit(password) && atLeastTwoDigits(password)) {
            System.out.println("Valid Password ");
        } else {
            System.out.println("Invalid Password");
        }
    }

    public static boolean validPasswordSize(String password) {
        return password.length() >= 8;
    }

    public static boolean isLettersOrDigit(String password) {
        int length = password.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean atLeastTwoDigits(String password) {
        int length = password.length();
        int counter = 0;
        for (int i = 0; i < length; i++) {
            if (Character.isDigit(password.charAt(i))) {
                counter++;
            }
            if (counter == 2) {
                return true;
            }
        }
        return false;
    }
}

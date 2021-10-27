package homework.chapter04;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two characters: ");
        String string = scanner.nextLine();
        char a = string.toUpperCase().charAt(0);
        char b = string.charAt(1);

        if ((a == 'M' || a == 'C' || a == 'I') && ('1' <= b && b <= '4')) {
            switch (a) {
                case 'M':
                    System.out.print("Mathematics ");
                    break;
                case 'C':
                    System.out.print("Computer Science ");
                    break;
                case 'I':
                    System.out.print("Information Technology ");
                    break;
            }
            switch (b) {
                case '1':
                    System.out.println("Freshman");
                    break;
                case '2':
                    System.out.println("Sophomore");
                    break;
                case '3':
                    System.out.println("Junior");
                    break;
                case '4':
                    System.out.println("Senior");
                    break;
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}

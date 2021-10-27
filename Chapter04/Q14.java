package homework.chapter04;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        String letter = scanner.nextLine();

        char l = letter.toUpperCase().charAt(0);

        if (l <= 'F' && l >= 'A') {
            System.out.print("The numeric value for grade " + letter + " is ");

            switch (l) {
                case 'A' : System.out.println("4"); break ;
                case 'B' : System.out.println("3"); break ;
                case 'C' : System.out.println("2"); break ;
                case 'D' : System.out.println("1"); break ;
                case 'F' : System.out.println("0"); break ;
            }
        }
        else System.out.println(l + " is an invalid grade");
    }
}

package homework.chapter04;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a SSN: ");
        String s = input.nextLine();
        String part1 = s.substring(0, 3);
        String part2 = s.substring(4, 6);
        String part3 = s.substring(7, 11);

        if (Character.isDigit(s.charAt(0)) && Character.isDigit(s.charAt(1)) && Character.isDigit(s.charAt(2))
                && Character.isDigit(s.charAt(4)) && Character.isDigit(s.charAt(5)) && Character.isDigit(s.charAt(7))
                && Character.isDigit(s.charAt(8)) && Character.isDigit(s.charAt(9)) && Character.isDigit(s.charAt(10))
                && (s.charAt(3) == '-') && (s.charAt(6) == '-') && s.length() == 11) {

            System.out.println(s + " is a valid social security number");
        } else {

            System.out.println(s + " is an invalid social security number");
        }


    }
}




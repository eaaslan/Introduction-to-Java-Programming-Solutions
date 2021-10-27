package homework.chapter04;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        System.out.println("Enter a month: ");
        String month = scanner.nextLine().toUpperCase();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        switch (month) {
            case "JAN":
                System.out.println("January " + year + " had 31 days");
                break;
            case "FEB":
                if (isLeapYear) {
                    System.out.println("Feb " + year + " had 29 days");
                } else
                    System.out.println("Feb " + year + " had 28 days");
                break;
            case "MAR":
                System.out.println("March " + year + " had 31 days");
                break;
            case "APR":
                System.out.println("Ap " + year + " had 31 days");
                break;
            case "MAY":
                System.out.println("May " + year + " had 31 days");
                break;
            case "JUN":
                System.out.println("June " + year + " had 30 days");
                break;
            case "JUL":
                System.out.println("July " + year + " had 31 days");
                break;
            case "AUG":
                System.out.println("August " + year + " had 31 days");
                break;
            case "SEP":
                System.out.println("September " + year + " had 30 days");
                break;
            case "OCT":
                System.out.println("October " + year + " had 31 days");
                break;
            case "NOV":
                System.out.println("November " + year + " had 30 days");
                break;
            case "DEC":
                System.out.println("December " + year + " had 31 days");
                break;
        }
    }
}

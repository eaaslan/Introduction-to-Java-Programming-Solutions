package homework.chapter03;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month and year: ");
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        switch (month) {
            case 1:
                System.out.println("January " + year + " had 31 days");
                break;
            case 2:
                if (isLeapYear) {
                    System.out.println("Feb " + year + " had 29 days");
                } else
                    System.out.println("Feb " + year + " had 28 days");
                break;
            case 3:
                System.out.println("March " + year + " had 31 days");
                break;
            case 4:
                System.out.println("Ap " + year + " had 31 days");
                break;
            case 5:
                System.out.println("May " + year + " had 31 days");
                break;
            case 6:
                System.out.println("June " + year + " had 30 days");
                break;
            case 7:
                System.out.println("July " + year + " had 31 days");
                break;
            case 8:
                System.out.println("August " + year + " had 31 days");
                break;
            case 9:
                System.out.println("September " + year + " had 30 days");
                break;
            case 10:
                System.out.println("October " + year + " had 31 days");
                break;
            case 11:
                System.out.println("November " + year + " had 30 days");
                break;
            case 12:
                System.out.println("December " + year + " had 31 days");
                break;
        }
    }
}

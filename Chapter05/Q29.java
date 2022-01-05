package homework.chapter05;

import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        System.out.print("Enter a day: ");
        int startDay = scanner.nextInt();

        for (int month = 1; month <= 12; month++) {
            String sMonth;

            sMonth = switch (month) {
                case 1 -> "January";
                case 2 -> "February";
                case 3 -> "March";
                case 4 -> "April";
                case 5 -> "May";
                case 6 -> "June";
                case 7 -> "July";
                case 8 -> "August";
                case 9 -> "September";
                case 10 -> "October";
                case 11 -> "November";
                case 12 -> "December";
                default -> "";
            };

            int numberOfDayInMonth;
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                numberOfDayInMonth = 31;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                numberOfDayInMonth = 30;
            } else {
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                    numberOfDayInMonth = 29;
                else
                    numberOfDayInMonth = 28;
            }
            System.out.println("                " + year + " " + sMonth);
            System.out.println("-----------------------------------------------\n" +
                    "   Sun   Mon   Tue   Wed   Thu   Fri   Sat");

            for (int j = startDay; j > 0; j--) {
                System.out.print("      ");
            }

            for (int i = 1; i <= numberOfDayInMonth; i++) {
                System.out.printf("%6d", i);
                if ((startDay + i) % 7 == 0 || i == numberOfDayInMonth) {
                    System.out.println();
                }
            }

            startDay += numberOfDayInMonth;
            startDay %= 7;
        }
    }
}
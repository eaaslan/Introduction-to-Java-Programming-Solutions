package homework.chapter06;

import java.util.Scanner;

public class Q34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter full year (e.g., 2001): ");
        int year = scanner.nextInt();

        // Prompt the user to enter month
        System.out.print("Enter month in number between 1 and 12: ");
        int month = scanner.nextInt();

        // Print calendar for the month of the year
        printMonth(year, month);

    }

    private static void printMonth(int year, int month) {
        printMonthTitle(year, month);
        printMonthBody(year, month);

    }
    private static void printMonthBody(int year, int month) {
        int startDay = getStartDay(year, month);
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        for (int i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d",i);

            if((startDay+i)%7==0){
                System.out.println();
            }
        }
    }
    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12)
            return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        if (month == 2) return isLeapYear(year) ? 29 : 28;

        return 0;
    }
    private static int getStartDay(int year, int month) {
        final int START_DAY_FOR_JAN_1_1800 =2;
        int TotalDay = getTotalNumberOfDays(month, year);

        return (TotalDay + START_DAY_FOR_JAN_1_1800) % 7;

    }
    private static int getTotalNumberOfDays(int month, int year) {
        int totalDay = 0;

        // Get the totalDay days from 1800 to 1/1/year
        for (int i = 1800; i < year; i++) {
            if (isLeapYear(i))
                totalDay = totalDay + 366;
            else
                totalDay = totalDay + 365;
        }
        // Add days from Jan to the month prior to the calendar month
        for (int i = 1; i < month; i++) {
            totalDay = totalDay + getNumberOfDaysInMonth(year, i);
        }
        return totalDay;

    }
    private static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
    private static void printMonthTitle(int year, int month) {
        String str = getMonthName(month);
        System.out.println("     " + year + " " + str);
        System.out.println("-----------------------------");
        System.out.println("  Mon Tue Wed Thu Fri Sat Sun");
    }
    private static String getMonthName(int month) {
        String monthName = null;
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        return null;
    }
}

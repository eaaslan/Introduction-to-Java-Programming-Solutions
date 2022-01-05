package homework.chapter06;
import java.util.Scanner;

public class Q33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full year (e.g., 2001): ");
        int year = scanner.nextInt();
        System.out.print("Enter month in number between 1 and 12: ");
        int month = scanner.nextInt();

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
            System.out.printf("%4d", i);

            if ((startDay + i) % 7 == 0) {
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
    private static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
    private static void printMonthTitle(int year, int month) {
        String str = getMonthName(month);
        System.out.println("     " + year + " " + str);
        System.out.println("-----------------------------");
        System.out.println("  Mon Tue Wed Thu Fri Sat Sun");
    }
    public static int getStartDay(int year, int month) {
        int y = year;
        int m = month;
        int q = 1;
        if (m == 1 || m == 2) {
            m = m + 12;
            y = y - 1;
        }
        int j = y / 100;
        int k = y % 100;
        int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        return h-2;
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

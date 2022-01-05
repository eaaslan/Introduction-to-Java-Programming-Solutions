package homework.chapter05;

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        System.out.print("Enter a day: ");
        int day = scanner.nextInt();

        for (int month = 1; month <= 12; month++) {
            String sMonth;
            String sDay;

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
            day %= 7;
            sDay = switch (day) {
                case 0 -> "Sunday";
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                default -> "";
            };

            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                day += 31;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                day += 30;
            } else {
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                    day += 29;
                else
                    day += 28;
            }
            System.out.println(sMonth + " 1, " + year + " is " + sDay);
        }
    }
}


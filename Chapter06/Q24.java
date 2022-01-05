package homework.chapter06;

public class Q24 {

    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        System.out.println((currentHour + 3) + ":" + currentMinutes + ":" + currentSeconds);
        System.out.println(getDate(totalHours));
    }

    public static String getDate(long totalHours) {
        int currentYear = 1970;
        long totalDay = totalHours / 24;

        while (totalDay > 365) {
            if (isLeapYear(currentYear)) {
                totalDay -= 366;
            } else {
                totalDay -= 365;
            }
            currentYear++;
        }

        return getMonthAndDay(currentYear, totalDay);
    }

    public static String getMonthAndDay(int currentYear, long totalDay) {
        int month = 1;
        for (; month <= 12; month++) {
            int currentDayInMonth = getNumberOfDaysInMonth(currentYear, month);
            if (totalDay <= currentDayInMonth) {
                break;
            }
            totalDay -= currentDayInMonth;
        }
        long currentDay = totalDay + 1;

        return getMonthName(month) + " " + currentDay + " " + currentYear;

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

    public static Boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static String getMonthName(int month) {
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
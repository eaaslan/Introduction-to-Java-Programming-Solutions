package homework.chapter06;

public class Q16 {
    public static void main(String[] args) {
        for (int i = 2000; i <= 2020; i++) {
            System.out.println(i + " is " + numberOfDaysInAYear(i) + " days");
        }
    }

    public static int numberOfDaysInAYear(int year) {
        return (isLapYear(year)) ? 366 : 365;
    }

    private static boolean isLapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}



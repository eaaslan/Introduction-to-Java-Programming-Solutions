package homework.chapter06;

import java.util.Scanner;

public class Q25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter milliseconds: ");
        long millis = scanner.nextLong();
        System.out.println(convertMillis(millis));
    }

    public static String convertMillis(long millis) {
        long hour = millis / 3600000;
        millis = millis % 3600000;
        long minute = millis / 60000;
        millis = millis % 60000;
        long second = millis / 1000;
        String time = "";
        time += Long.toString(hour) + ":" + Long.toString(minute) + ":" + Long.toString(second);
        return time;
    }
}

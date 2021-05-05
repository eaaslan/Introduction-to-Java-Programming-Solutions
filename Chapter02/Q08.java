/*
(Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
the current time in GMT. Revise the program so that it prompts the user to enter
the time zone offset to GMT and displays the time in the specified time zone.
 */
package homework.chapter02;
import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        int gmt = scanner.nextInt();

        long totalMiliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMiliSeconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = ((totalHours + gmt) % 24);

        System.out.println("Current time is " + (currentHour) + ":" + currentMinute + ":" + currentSeconds);
    }
}

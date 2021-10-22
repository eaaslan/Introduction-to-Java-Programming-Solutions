package homework.chapter03;

public class Q30 {

    public static void main(String[] args) {

        long totalMiliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMiliSeconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours + 3) % 24;

        boolean isAm = currentHour > 12;
        currentHour = isAm ? currentHour % 12 : currentHour;

        System.out.print("Current time is " + currentHour + ":"
                + currentMinute + ":" + currentSeconds + " " + (isAm ? "AM" : "PM"));
    }
}

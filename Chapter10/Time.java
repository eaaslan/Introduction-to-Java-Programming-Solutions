package homework.chapter10;

/************************************************
 *                      Time                     *
 *-----------------------------------------------*
 * -hour: long                                   *
 * -minute: long                                 *
 * -second: long                                 *
 * Time()                                        *
 * Time(elapseTime: long)                        *
 * Time(hour: long, minute: long, second: long)  *
 * getHour(): long                               *
 * getMinute(): long                             *
 * getSecond(): long                             *
 * setTime(elapseTime: long)                     *
 ************************************************/

public class Time {

    private long hour;
    private long minute;
    private long second;

    public Time() {

        this(0);
    }

    public Time(long elapsedTime) {
        setTime(elapsedTime);

    }

    public Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    private void setTime(long elapsedTime) {
        long totalMilliSeconds = elapsedTime;
        if (elapsedTime == 0) {
            totalMilliSeconds = System.currentTimeMillis();
        }
        long totalSeconds = totalMilliSeconds / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        this.second = totalSeconds % 60;
        this.minute = totalMinutes % 60;
        this.hour = (totalHours % 24) + 3;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }
}

class TestTime {
    public static void main(String[] args) {
        Time time = new Time();
        System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
    }

}

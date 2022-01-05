package homework.chapter09;
import java.util.GregorianCalendar;

public class Q05 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();

        System.out.println(calendar.getTime());
        calendar.setTimeInMillis(1234567898765L);
        System.out.println(calendar.getTime());
    }
}

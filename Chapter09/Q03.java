package homework.chapter09;

import java.util.Date;

public class Q03 {

    public static void main(String[] args) {

        Date date = new Date();


        for (long i = 10_000; i <= 100_000_000_000L; i *= 10) {
            date.setTime(i);
            System.out.println(date.toString()); // toString yapınca ne değişiyor ?
        }
    }
}

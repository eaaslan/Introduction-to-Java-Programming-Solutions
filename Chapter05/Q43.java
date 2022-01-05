package homework.chapter05;

public class Q43 {
    public static void main(String[] args) {

        int counter = 0;
        for (int i = 1; i <= 7; i++) {
            for (int j = 1 + i; j <= 7; j++) {
                counter++;
                System.out.println(i + " " + j);
            }
        }
        System.out.println(counter);
    }
}

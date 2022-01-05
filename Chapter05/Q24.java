package homework.chapter05;

public class Q24 {
    public static void main(String[] args) {

        System.out.println(1 - 0.9);

        double sum = 0;
        for (int i = 1; i <= 97; i += 2) {
            sum += (i) / (i + 2.0);
        }
        System.out.println(sum);
    }
}

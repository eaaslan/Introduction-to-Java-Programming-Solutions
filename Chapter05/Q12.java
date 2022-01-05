package homework.chapter05;

public class Q12 {
    public static void main(String[] args) {
        int n = 1;
        while (n * n <= 12_000) {
            n++;
        }
        n++;
        System.out.println(n);
    }
}
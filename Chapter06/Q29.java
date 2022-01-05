package homework.chapter06;

public class Q29 {
    public static void main(String[] args) {
        for (int i = 3; i < 1000; i++)
            if (isPrime(i) && isPrime(i + 2))
                System.out.printf("(%d,%d)\n", i, i + 2);
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; ++i)
            if (num % i == 0)
                return false;

        return true;
    }
}

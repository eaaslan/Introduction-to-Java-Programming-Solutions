package homework.chapter06;

public class Q10 {
    public static void main(String[] args) {

        int counter = 0;
        for (int i = 2; i < 1000; i++) {
            if (isPrime(i)) {
                System.out.printf("%4d",i);
                if (++counter % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // number is not a prime
            }
        }
        return true; // number is prime
    }
}

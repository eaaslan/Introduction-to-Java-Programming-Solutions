package homework.chapter05;

public class Q20 {
    public static void main(String[] args) {

        boolean isPrime = true;
        int printCounter = 0;

        for (int i = 2; i < 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.printf("%4d", i);
                printCounter++;
                if (printCounter % 8 == 0) {
                    System.out.println(" ");
                }
            }
        }
    }
}

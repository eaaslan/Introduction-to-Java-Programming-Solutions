package homework.chapter07;

public class Q06 {
    public static void main(String[] args) {
        int num = 2;
        int[] prime = new int[50];
        int index = 0;
        while (index != 50) {
            if (isPrime(num)) {
                prime[index] = num;
                index++;
            }
            num++;
        }
        printArray(prime);
    }

    private static void printArray(int[] prime) {
        for (int i = 0; i < 50; i++) {
            System.out.println(prime[i]);
        }
    }
    private static boolean isPrime(int num) {
        for (int i = 2; i <= Math.pow(num, 0.5); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
package homework.chapter10;

import chapter10.Q05.StackOfIntegers;

public class Q06 {
    public static void main(String[] args) {

        StackOfIntegers stackOfIntegers = new StackOfIntegers();

        for (int i = 2; i < 120; i++) {

            if (isPrime(i)) {
                stackOfIntegers.push(i);
            }
        }
        while (!stackOfIntegers.empty()) {
            System.out.print(stackOfIntegers.pop() + " ");
        }
    }

    private static boolean isPrime(int num) {

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

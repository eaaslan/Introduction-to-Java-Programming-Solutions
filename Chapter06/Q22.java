package homework.chapter06;

public class Q22 {
    public static void main(String[] args) {
        System.out.println(sqrt(9));
    }

    public static double sqrt(long n) {
        double lastGuess = 1;
        double nextGuess = (lastGuess + n / lastGuess) / 2;

        while (Math.abs(nextGuess - lastGuess) >= 0.00000001) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        }

        return nextGuess;
    }
}

package homework.chapter07;
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[100];
        int input;
        System.out.print("Enter the integers between 1 and 100(Inputs end with 0): ");
        do {
            input = scanner.nextInt();

            if (0 < input && input < 101) {
                num[input - 1]++;
            }
        } while (input != 0);
        printCounter(num);
    }
    private static void printCounter(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                if (num[i] == 1) {
                    System.out.println((i + 1) + " occurs " + num[i] + " time");
                } else
                    System.out.println((i + 1) + " occurs " + num[i] + " times");
            }
        }
    }
}

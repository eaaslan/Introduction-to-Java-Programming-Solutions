package homework.chapter06;
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int num = scanner.nextInt();
        displayPattern(num);
    }
    public static void displayPattern(int n) {
        int space = n * 2 - 2;
        for (int i = 1; i < n + 1; i++) {
            System.out.println();
            for (int k = space; k > 0; k--) {
                System.out.print(" ");
            }
            space -= 2;
            for (int j = i; j > 0; j--) {
                System.out.printf("%2d", j);
            }
        }
    }
}


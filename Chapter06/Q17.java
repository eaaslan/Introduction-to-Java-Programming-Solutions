package homework.chapter06;
import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int matrix = scanner.nextInt();
        printMatrix(matrix);
    }
    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int random = (int) ((Math.random() * 2));
                System.out.print(" " + random);
            }
            System.out.println();
        }
    }
}

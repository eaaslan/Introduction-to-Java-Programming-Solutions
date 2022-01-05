package homework.chapter08;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matrix = new double[3][3];
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = scanner.nextDouble();
            }
        }
        if (isMarkovMatrix(matrix)) System.out.println("It is a Markov matrix ");
        else System.out.println("It is not a Markov matrix");
    }

    public static boolean isMarkovMatrix(double[][] m) {
        for (double[] doubles : m) {
            for (int column = 0; column < doubles.length; column++) {
                if (doubles[column] < 0) return false;
            }
        }
        for (int col = 0; col < m.length; col++) {
            double sum = 0;
            for (int row = 0; row < m[col].length; row++) {
                sum += m[row][col];
            }
            if (sum == 1) return true;
        }
        return false;
    }
}

package homework.chapter08;

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matrix = new double[3][3];
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = scanner.nextDouble();
            }
        }
        sortRows(matrix);

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column]);
                System.out.print("  ");
            }
            System.out.println();

        }

    }

    public static double[][] sortRows(double[][] matrix) {
        int column = 0;
        for (int row = 0; row < matrix.length; row++) {
            double temp;
            if (matrix[row][column + 1] < matrix[row][column]) {
                temp = matrix[row][column];
                matrix[row][column] = matrix[row][column + 1];
                matrix[row][column + 1] = temp;
            }
            if (matrix[row][column + 2] < matrix[row][column + 1]) {
                temp = matrix[row][column + 1];
                matrix[row][column + 1] = matrix[row][column + 2];
                matrix[row][column + 2] = temp;
            }
            if (matrix[row][column + 1] > matrix[row][column]) {
                continue;
            } else {
                temp = matrix[row][column];
                matrix[row][column] = matrix[row][column + 1];
                matrix[row][column + 1] = temp;
            }

        }
        return matrix;

    }
}

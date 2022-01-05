package homework.chapter08;

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 3-by-3 matrix row by row: ");

        double[][] matrix = new double[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        sortCol(matrix);
        display(matrix);

    }

    private static void sortCol(double[][] matrix) {
        double[] column = new double[matrix[0].length];
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                column[row] = matrix[row][col];
            }
            sort(column);
            insert(matrix, column, col);
        }
    }

    private static void sort(double[] column) {

        for (int i = 0; i < column.length; i++) {
            double currentMin = column[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < column.length; j++) {

                if (column[j] < currentMin) {
                    currentMin = column[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                column[currentMinIndex] = column[i];
                column[i] = currentMin;
            }
        }
    }

    private static void insert(double[][] matrix, double[] column, int col) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = column[i];
        }
    }

    private static void display(double[][] matrix) {
        for (double[] doubles : matrix) {
            for (double aDouble : doubles) {
                System.out.printf("%4.3f ", aDouble);
            }
            System.out.println();
        }
    }
}

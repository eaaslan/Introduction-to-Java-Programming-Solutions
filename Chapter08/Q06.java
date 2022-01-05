package homework.chapter08;

import java.util.Scanner;

public class Q06 {
    private final static int N = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        System.out.print("Enter matrix1: ");
        for (int row = 0; row < matrix1.length; row++) {
            for (int column = 0; column < matrix1[row].length; column++) {
                matrix1[row][column] = scanner.nextDouble();
            }
        }
        System.out.print("Enter matrix2: ");
        for (int row = 0; row < matrix2.length; row++) {
            for (int column = 0; column < matrix2[row].length; column++) {
                matrix2[row][column] = scanner.nextDouble();
            }
        }
        double[][] multiplyMatrix = multiplyMatrix(matrix1, matrix2);

        Q05.printOperation(matrix1, matrix2, multiplyMatrix, "*");
    }

    public static double[][] multiplyMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] multiplyMatrix = new double[3][3];
        for (int row = 0; row < multiplyMatrix.length; row++) {
            for (int col = 0; col < multiplyMatrix[0].length; col++) {
                multiplyMatrix[row][col] = findCell(matrix1, row, matrix2,  col);
            }
        }
        return multiplyMatrix;
    }

    private static double findCell(double[][] matrix1, int row, double[][] matrix2, int col) {
        double sum = 0;

        for (int i = 0; i < N; i++) {
            sum += matrix1[row][i] * matrix2[i][col];
        }

        return sum;
    }
}

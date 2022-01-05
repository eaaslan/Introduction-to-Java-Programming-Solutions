package homework.chapter08;

import java.util.Scanner;

public class Q05 {
    private final static int N = 3;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[][] matrix1 = new double[N][N];
        double[][] matrix2 = new double[N][N];
        System.out.print("Enter matrix1: ");
        for (int row = 0; row < matrix1.length; row++) {
            for (int column = 0; column < N; column++) {
                matrix1[row][column] = scanner.nextDouble();
            }
        }
        System.out.print("Enter matrix2: ");
        for (int row = 0; row < matrix2.length; row++) {
            for (int column = 0; column < N; column++) {
                matrix2[row][column] = scanner.nextDouble();
            }
        }
        double[][] sumMatrix = sumMatrix(matrix1, matrix2);

        printOperation(matrix1, matrix2, sumMatrix, "+");
    }

    public static void printOperation(double[][] matrix1, double[][] matrix2, double[][] sumMatrix, String operation) {
        System.out.println("The matrices are added as follows ");
        for (int row = 0; row < N; row++) {
            for (int column = 0; column < N; column++) {
                System.out.printf("%5.1f ", matrix1[row][column]);
            }

            if (row == N / 2) {
                System.out.print(operation);
            } else {
                System.out.print(" ");
            }

            for (int column = 0; column < N; column++) {
                System.out.printf("%5.1f ", matrix2[row][column]);
            }

            if (row == N / 2) {
                System.out.print("=");
            } else {
                System.out.print(" ");
            }

            for (int column = 0; column < sumMatrix[row].length; column++) {
                System.out.printf("%5.1f ", sumMatrix[row][column]);
            }

            System.out.println();
        }
    }

    private static double[][] sumMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] sumMatrix = new double[N][N];

        for (int row = 0; row < sumMatrix.length; row++) {
            for (int column = 0; column < sumMatrix[row].length; column++) {
                sumMatrix[row][column] = matrix1[row][column] + matrix2[row][column];
            }
        }
        return sumMatrix;
    }
}

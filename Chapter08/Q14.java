package homework.chapter08;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size for the matrix: ");
        int size = 3; //scanner.nextInt();
        int[][] matrix = new int[size][size];

        fillRandomly(matrix);
        print(matrix);
        System.out.print("All 1s on row ");
        boolean[] allOneRow = getAllSameRow(matrix, 1);
        for (int row = 0; row < matrix.length; row++) {
            if (allOneRow[row]) {
                System.out.print(row);
            } else System.out.print("-");
        }
        System.out.println();
        System.out.print("All 0s on row ");
        boolean[] allZeroRow = getAllSameRow(matrix, 0);
        for (int row = 0; row < matrix.length; row++) {
            if (allZeroRow[row]) {
                System.out.print(row);
            } else System.out.print("-");
        }
        System.out.println();
        System.out.print("All 1s on column ");
        boolean[] allOneColumn = getAllSameColumn(matrix, 1);
        for (int column = 0; column < matrix.length; column++) {
            if (allOneColumn[column]) {
                System.out.print(column);
            } else System.out.print("-");
        }
        System.out.println();
        System.out.print("All 0s on column ");
        boolean[] allZeroColumn = getAllSameColumn(matrix, 0);
        for (int column = 0; column < matrix.length; column++) {
            if (allZeroColumn[column]) {
                System.out.print(column);
            } else System.out.print("-");
        }
        System.out.println();
        if (isAllDiagonal(matrix, 1) || isAllDiagonal(matrix, 0)) {
            if (isAllDiagonal(matrix, 1)) {
                System.out.println("Matrix have major diagonal with 1s");
            } else System.out.println("Matrix have major diagonal with 0s");
        } else System.out.println("No same numbers on the major diagonal");

        if (isAllSubDiagonal(matrix, 1) || isAllSubDiagonal(matrix, 0)) {
            if (isAllSubDiagonal(matrix, 1)) {
                System.out.println("Matrix have sub diagonal with 1s");
            } else System.out.println("Matrix have sub diagonal with 0s");
        } else System.out.println("No same numbers on the sub diagonal");
    }

    private static void print(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    private static boolean[] getAllSameRow(int[][] matrix, int type) {
        boolean[] allOne = new boolean[matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            int count = 0;
            for (int column = 0; column < matrix.length; column++) {
                if (matrix[row][column] == type) {
                    count++;
                }
            }
            if (count == matrix.length) {
                allOne[row] = true;
            }
        }
        return allOne;
    }

    private static boolean[] getAllSameColumn(int[][] matrix, int type) {
        boolean[] allOne = new boolean[matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            int count = 0;
            for (int column = 0; column < matrix.length; column++) {
                if (matrix[column][row] == type) {
                    count++;
                }
            }
            if (count == matrix.length) {
                allOne[row] = true;
            }
        }
        return allOne;
    }

    private static boolean isAllDiagonal(int[][] matrix, int type) {
        boolean isDiagonal = false;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] == type) {
                count++;
            }
        }
        if (count == matrix.length) {
            isDiagonal = true;
        }
        return isDiagonal;
    }

    private static boolean isAllSubDiagonal(int[][] matrix, int type) {
        boolean isDiagonal = false;
        int count = 0;
        for (int row = 0, column = matrix.length - 1; row < matrix.length - 1; row++, column--) {

            if (matrix[row][column] == type) {
                count++;
            }
        }
        if (count == matrix.length - 1) {
            isDiagonal = true;
        }
        return isDiagonal;
    }

    private static void fillRandomly(int[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 2);
            }
        }
    }
}

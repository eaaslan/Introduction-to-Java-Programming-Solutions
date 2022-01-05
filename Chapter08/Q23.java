package homework.chapter08;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        Scanner scanner = new Scanner(System.in);
        int[] evenRow = new int[matrix.length];
        int[] evenCol = new int[matrix.length];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = scanner.nextInt();
            }
        }
        System.out.print("The flipped cell is at (");
        for (int row = 0; row < matrix.length; row++) {
            if (!checkRow(matrix, row)) {
                System.out.print(row + ",");
            }
        }
        for (int col = 0; col < matrix.length; col++) {
            if (!checkCol(matrix, col)) {
                System.out.print(col + ")");
            }
        }
//        System.out.print("The flipped cell is at (");
//        for (int row = 0; row < matrix.length; row++) {
//            if (evenRow[row] == 0) {
//                System.out.print(row + ",");
//            }
//        }
//        for (int col = 0; col < matrix.length; col++) {
//            if (evenCol[col] == 0) {
//                System.out.println(col + ")");
//            }
//        }
    }

    private static boolean checkCol(int[][] matrix, int col) {
        int counter = 0;
        for (int row = 0; row < matrix[col].length; row++) {
            if (matrix[row][col] == 1) {
                counter++;
            }
        }
        return (counter % 2 == 0);
    }

    private static boolean checkRow(int[][] matrix, int row) {
        int counter = 0;
        for (int col = 0; col < matrix[row].length; col++) {
            if (matrix[row][col] == 1) {
                counter++;
            }
        }
        return (counter % 2 == 0);
    }
}

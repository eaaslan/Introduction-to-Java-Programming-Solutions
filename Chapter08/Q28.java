package homework.chapter08;

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        System.out.print("Enter list1: ");
        insert(matrix1, scanner);
        System.out.print("Enter list2: ");
        insert(matrix2, scanner);

        if (equals(matrix1, matrix2))
            System.out.println("The two arrays are strictly identical ");

        else System.out.println("The two arrays are not strictly identical ");
    }

    private static void insert(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        if (m1.length != m2.length || m1[0].length != m2[0].length) return false;
        for (int row = 0; row < m1.length; row++) {
            for (int col = 0; col < m1.length; col++) {
                if (m1[row][col] != m2[row][col])
                    return false;
            }
        }
        return true;
    }
}

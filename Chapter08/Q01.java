package homework.chapter08;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] matrix = new double[3][4];
        int index = 0;
        System.out.print("Enter a 3-by-4 matrix row by row: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = scanner.nextDouble();
            }
        }

        System.out.println("Sum of the elements at column " + 0 + " is " + sumColumn(matrix, 0));
        System.out.println("Sum of the elements at column " + 1 + " is " + sumColumn(matrix, 1));
        System.out.println("Sum of the elements at column " + 2 + " is " + sumColumn(matrix, 2));
        System.out.println("Sum of the elements at column " + 3 + " is " + sumColumn(matrix, 3));
    }

    private static double sumColumn(double[][] matrix, int index) {
        double sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            sum += matrix[row][index];
        }
       return sum;
    }
}

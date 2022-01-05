package homework.chapter08;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the array: ");
        double[][] matrix = new double[scanner.nextInt()][scanner.nextInt()];
        System.out.println("Enter the array: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = scanner.nextDouble();
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        Location largestElement = getLargest(matrix);
        System.out.print("The location of the largest element is at ");
        System.out.println("(" + largestElement.row + "," + largestElement.column + ")");
    }

    private static Location getLargest(double[][] matrix) {
        double currentMax = 0;
        Location currentMaxIndex = null;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (currentMax < matrix[row][column]) {
                    currentMax = matrix[row][column];
                    currentMaxIndex = new Location(row, column);
                }
            }
        }
        return currentMaxIndex;
    }
}

class Location {
    int row;
    int column;

    public Location(int row, int column) {
        this.row = row;
        this.column = column;
    }
}

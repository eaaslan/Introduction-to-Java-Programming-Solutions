package homework.chapter08;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] matrix = new double[5][2];
        System.out.print("Enter five points: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = scanner.nextDouble();
            }
        }
        if (sameLine(matrix)) System.out.println("The five points are on the same line ");
        else System.out.println("The five points are not on the same line ");

    }

    public static boolean sameLine(double[][] points) {

        double x0 = points[0][0];
        double y0 = points[0][1];
        double x1 = points[1][0];
        double y1 = points[1][1];
        double x2 = points[2][0];
        double y2 = points[2][1];
        return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) == 0;
    }

}

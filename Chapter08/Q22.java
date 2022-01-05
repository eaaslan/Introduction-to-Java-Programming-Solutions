package homework.chapter08;

public class Q22 {
    public static void main(String[] args) {

        int[][] matrix = new int[6][6];
        fillRandomly(matrix);
        displayMatrix(matrix);


        for (int row = 0; row < matrix.length; row++) {
            if (checkRow(matrix, row)) {
                System.out.println("Row " + row + " have even number of 1s");
            }
        }
        for (int col = 0; col < matrix.length; col++) {
            if (checkCol(matrix, col)) {
                System.out.println("Col " + col + " have even number of 1s");
            }
        }
    }

    private static void displayMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    private static void fillRandomly(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 2);
            }
        }
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

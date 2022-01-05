package homework.chapter08;

public class Q16 {
    public static void main(String[] args) {

        int[][] matrix = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};

        sortArray(matrix);

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    private static void sortArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int currentMinRow = matrix[i][0];
            int currentMinCol = matrix[i][1];
            int currentMinIndex = i;

            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[j][0] < currentMinRow) {
                    currentMinRow = matrix[j][0];
                    currentMinCol = matrix[j][1];
                    currentMinIndex = j;
                } else if (currentMinRow == matrix[j][0] && currentMinCol > matrix[j][1]) {
                    currentMinCol = matrix[j][1];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                matrix[currentMinIndex][0] = matrix[i][0];
                matrix[currentMinIndex][1] = matrix[i][1];
                matrix[i][0] = currentMinRow;
                matrix[i][1] = currentMinCol;
            }
        }
    }
}
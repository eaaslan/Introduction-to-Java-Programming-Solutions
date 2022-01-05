package homework.chapter08;

public class Q10 {
    public static void main(String[] args) {

        int[][] matrix = new int[4][4];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (Math.random() > 0.5) ? 1 : 0;
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println("The largest row index: " + maxRowIndex(matrix));
        System.out.println("The largest column index: " + maxColumnIndex(matrix));

    }

    private static int maxRowIndex(int[][] matrix) {
        int currentMax = 0;
        int currentMaxIndex = 0;

        for (int row = 0; row < matrix.length; row++) {
            int sum = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                sum += matrix[row][column];
            }

            if (currentMax < sum) {
                currentMax = sum;
                currentMaxIndex = row;
            }
        }
        return currentMaxIndex;
    }

    private static int maxColumnIndex(int[][] matrix) {
        int currentMax = 0;
        int currentMaxIndex = 0;

        for (int column = 0; column < matrix.length; column++) {
            int sum = 0;
            for (int row = 0; row < matrix[column].length; row++) {
                sum += matrix[row][column];
            }

            if (currentMax < sum) {
                currentMax = sum;
                currentMaxIndex = column;
            }
        }
        return currentMaxIndex;
    }
}

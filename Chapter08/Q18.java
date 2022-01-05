package homework.chapter08;

public class Q18 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        shuffle(matrix);
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static void shuffle(int[][] m) {

        int randomIndex = (int) (Math.random() * 5);

        for (int i = 0; i < m.length; i++) {
            int tempRow = m[i][0];
            int tempCol = m[i][1];
            m[i][0] = m[randomIndex][0];
            m[i][1] = m[randomIndex][1];
            m[randomIndex][0] = tempRow;
            m[randomIndex][1] = tempCol;
        }

    }
}

package homework.chapter08;

import java.util.Arrays;
import java.util.Scanner;

public class Q09 {

    private static final String X = "X";
    private static final String O = "O";
    private static final String EMPTY = " ";

    private static String[][] matrix = new String[3][3];


    public static void main(String[] args) {
        for (String[] strings : matrix) {
            Arrays.fill(strings, EMPTY);
        }

        while (true) {
            displayMatrix();
            drop(O);
            if (isWin(matrix, O)) {
                displayMatrix();
                System.out.println("O player won");
                System.exit(1);
            }
            displayMatrix();
            drop(X);
            displayMatrix();
            if (isWin(matrix, X)) {
                displayMatrix();
                System.out.println("X player won");
                System.exit(1);
            }
        }
    }

    private static void drop(String type) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a row (0, 1, or 2) for player " + type + ": ");
            int row = scanner.nextInt();
            System.out.print("Enter a column (0, 1, or 2) for player " + type + ": ");
            int column = scanner.nextInt();

            if (isEmpty(column, row)) {
                matrix[row][column] = type;
                break;
            } else {
                System.out.println("Index is full");
                System.out.println("Choose another Index"); // geri dönemiyor
            }
        }
        scanner.close();
    }

    private static boolean isEmpty(int column, int row) {
        return (matrix[row][column].equals(EMPTY));
    }

    private static boolean isWin(String[][] matrix, String s) {
        return checkHorizontal(s) || checkVertical(s) || checkDiagonal(s);
    }

    public static boolean checkHorizontal(String s) {
        for (int row = 0; row < matrix.length; row++) {
            int counter = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column].equals(s))
                    counter++;
            }
            if (counter == 3)
                return true;
        }
        return false;
    }

    public static boolean checkVertical(String s) {
        for (int column = 0; column < matrix.length; column++) {
            int counter = 0;
            for (int row = 0; row < matrix[column].length; row++) {
                if (matrix[row][column].equals(s))
                    counter++;
            }
            if (counter == 3)
                return true;
        }
        return false;
    }

    public static boolean checkDiagonal(String s) {
        int counter = 0;
        for (int row = 0, column = 0; row < matrix.length; row++, column++) {
            if (matrix[row][column].equals(s))
                counter++;
        }
        if (counter == 3)
            return true;

        counter = 0;
        for (int row = 0, column = 2; row < matrix.length; row++, column--) {
            if (matrix[row][column].equals(s))
                counter++;
        }
        if (counter == 3)
            return true;

        return false;
    }

    private static void displayMatrix() {
        for (int row = 0; row < matrix.length; row++) {
            System.out.println("--------");
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print("|" + matrix[row][column]);
            }
            System.out.println("|");
        }
        System.out.println("--------");

    }
}

package homework.chapter05;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row number ");
        int row = scanner.nextInt()+1;
        int columnWidth = (row + "").length() + 1;
        int space = row - 1; // each row has row-1 space
        int odd = 1;
        for (int i = 1; i < row; i++) { // row
            int k = 0;
            for (int s = 1; s < space; s++) {
                System.out.printf("%" + columnWidth + "s", "");
            }
            for (int j = 1; j <= odd; j++) { //column
                if (j <= i) {
                    k++;
                } else {
                    k--;
                }
                System.out.printf("%" + columnWidth + "d", k);
            }
            System.out.println("");
            odd = odd + 2; // increase as an odd number with every column
            space--; // space is decreasing row by row
        }
    }
}
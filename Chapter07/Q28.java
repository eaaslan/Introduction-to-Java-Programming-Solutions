package homework.chapter07;

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
/*
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

 */
        combinations(array);
    }

    public static void combinations(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1 ; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    System.out.println(array[i] + " " + array[j] + " " + array[k]);
                }
            }
        }
    }
}

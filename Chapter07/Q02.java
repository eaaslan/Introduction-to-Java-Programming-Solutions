package homework.chapter07;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total number: ");
        int[] array = new int[scanner.nextInt()];
        assignNum(array, scanner);
        int[] reverse = getReverse(array);
        for (int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i] + " ");
        }
    }

    private static void assignNum(int[] array, Scanner scanner) {
        System.out.print("Enter " + array.length + " numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    private static int[] getReverse(int[] array) {
        System.out.print("Reverse number order you entered: ");
        int[] reverse = new int[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            reverse[i] = array[j];
        }
        return reverse;
    }
}

package homework.chapter07;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        int counter = 0;
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < array.length; i++) {
            int num = scanner.nextInt();
            if (checkDistinct(array, num)) {
                array[i] = num;
                counter++;
            }
        }
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.print(array[i]+" ");
            }
        }
        System.out.println("\nThe number of distinct number is " + counter);
    }
    private static boolean checkDistinct(int[] array, int num) {
        for (int j : array) {
            if (num == j) {
                return false;
            }
        }
        return true;
    }
}

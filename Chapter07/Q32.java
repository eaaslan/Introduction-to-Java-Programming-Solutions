package homework.chapter07;
import java.util.Scanner;

public class Q32 {

    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list ");
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        */

        int[] array = {5, 8, 9, 3, 6, 2};
        partition(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void partition(int[] array) {
        int pivot = array[0];
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        while (true) {

            while (pivot >= array[leftIndex])
                leftIndex++;

            while (pivot < array[rightIndex])
                rightIndex--;

            if (leftIndex > rightIndex)
                break;

            int temp = array[leftIndex];
            array[leftIndex] = array[rightIndex];
            array[rightIndex] = temp;
        }

        array[0] = array[rightIndex];
        array[rightIndex] = pivot;

    }
}




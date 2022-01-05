package homework.chapter07;

import java.util.Arrays;

public class Q16 {
    public static void main(String[] args) {

        int[] array = new int[100_000_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        int key = (int) (Math.random() * 1000);

        Arrays.sort(array);

        long startTime = System.currentTimeMillis();
        LinearSearch(array, key);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("LinearSearch Execution time is: " + executionTime);

        startTime = System.currentTimeMillis();
        BinarySearch(array, key);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("BinarySearch Execution time is: " + executionTime);
    }

    public static int LinearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int BinarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (high >= low) {
            int mid = (high + low) / 2;

            if (key > array[mid]) {
                low = mid + 1;
            } else if (key < array[mid]) {

                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

package homework.chapter09.Q06;

import java.util.Random;

public class Q06TestStopwatch {
    public static void main(String[] args) {

        Q06Stopwatch stopwatch = new Q06Stopwatch();
        Random random = new Random();
        int[] array = new int[100_000];

        stopwatch.start();
        getRandom(random, array);
        selectionSort(array);
        stopwatch.stop();

        System.out.println("Elapsed time is "+ stopwatch.getElapsedTime()+" milliseconds");
    }
    private static void getRandom(Random random, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100_000);
        }
    }
    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int currentMin = array[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (currentMin > array[j]) {
                    currentMin = array[j];
                    currentMinIndex = j;
                }
            }
            if (currentMin != array[i]) {
                array[currentMinIndex] = array[i];
                array[i] = currentMin;
            }
        }
    }
}

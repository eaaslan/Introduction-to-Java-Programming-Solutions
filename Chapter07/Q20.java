package homework.chapter07;

public class Q20 {
    public static void main(String[] args) {
        int[] array = {4, 32, 5, 45, 34, 63, 5, 3, 2, 1};

        reverseSelection(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void reverseSelection(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int currentMax = array[i];
            int currentMaxIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (currentMax < array[j]) {
                    currentMax = array[j];
                    currentMaxIndex = j;
                }
            }

            if (currentMaxIndex != i) {
                array[currentMaxIndex] = array[i];
                array[i] = currentMax;
            }
        }

    }
}

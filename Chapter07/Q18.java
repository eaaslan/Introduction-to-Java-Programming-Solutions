package homework.chapter07;

public class Q18 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};

        bubbleSort(array);

        for (int a : array) {
            System.out.println(a);
        }
    }
    public static void bubbleSort(int[] array) {
        // array = new int[3];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
package homework.chapter07;

public class Q31 {
    public static void main(String[] args) {
        int[] array = {5, 1, 5, 16, 61, 111};
        int[] array2 = {4, 2, 4, 5, 6};
        int[] merged = merge(array, array2);
        for (int i = 0; i < merged.length; i++) {
            System.out.println(merged[i]);
        }
    }

    // O(n)
    public static int[] merge(int[] list1, int[] list2) {
        int newSize = list1.length + list2.length;
        int[] mergedArray = new int[newSize];

        int indexList1 = 0;
        int indexList2 = 0;
        int indexMergeArray = 0;

        while(indexList1 < list1.length && indexList2 < list2.length)
            if (list1[indexList1] < list2[indexList2])
                mergedArray[indexMergeArray++] = list1[indexList1++];
            else
                mergedArray[indexMergeArray++] = list2[indexList2++];

        while(indexList1 < list1.length)
            mergedArray[indexMergeArray++] = list1[indexList1++];


        while(indexList2 < list2.length)
            mergedArray[indexMergeArray++] = list2[indexList2++];


        return mergedArray;
    }

    // O(n^2)
    public static int[] mergeAndSelectedSort(int[] list1, int[] list2) {
        int newSize = list1.length + list2.length;
        int[] mergedArray = new int[newSize];

        for (int i = 0; i < list1.length; i++) {
            mergedArray[i] = list1[i];
        }
        for (int i = newSize - list1.length, j = 0; j < list2.length; i++, j++) {
            mergedArray[i + 1] = list2[j];
        }
        for (int i = 0; i < mergedArray.length; i++) {
            int currentMin = mergedArray[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < mergedArray.length; j++) {
                if (currentMin > mergedArray[j]) {
                    currentMin = mergedArray[j];
                    currentMinIndex = j;
                }
            }
            if (currentMin != mergedArray[i]) {
                mergedArray[currentMinIndex] = mergedArray[i];
                mergedArray[i] = currentMin;
            }
        }
        return mergedArray;
    }
}

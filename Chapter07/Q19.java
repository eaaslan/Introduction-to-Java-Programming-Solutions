package homework.chapter07;

public class Q19 {
    public static void main(String[] args) {

        int[] array = {1,2,25,0};
        if(checkSort(array)){
            System.out.println("The list is already sorted");
        } else {
            System.out.println("The list is not sorted");
        }
    }
    public static boolean checkSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int currentMin = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (currentMin > array[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

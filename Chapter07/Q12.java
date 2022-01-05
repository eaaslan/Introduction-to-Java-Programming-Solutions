package homework.chapter07;
import java.util.Arrays;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int[] reverse = reverse(array);

        print(reverse);
        System.out.println(Arrays.toString(reverse));
    }
    public static int[] reverse(int[] array) {
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            int temp = 0;
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }
    public static void print(int[] array) {
        for (int j : array) {
            System.out.print(j+" ");
        }
    }
}

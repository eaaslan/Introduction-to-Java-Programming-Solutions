package homework.chapter07;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] array = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextDouble();
        }
        System.out.print("The minimum number index is: ");
        System.out.println(min(array));
    }
    public static int min(double[] array) {
        double min = array[0];
        int indexOf = 0;
        for (int i = 0 ; i<array.length;i++) {
            if (min > array[i]) {
                min = array[i];
                indexOf = i;
            }
        }
        return indexOf;
    }
}

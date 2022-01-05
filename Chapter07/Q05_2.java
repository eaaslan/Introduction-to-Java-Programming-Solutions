package homework.chapter07;
import java.util.Scanner;

public class Q05_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[1000];
        int counter = 0;
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            array[num]++;
        }
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.print(i + " ");
                counter++;
            }
        }
        System.out.println("\nThe number of distinct number is " + counter);
    }
}

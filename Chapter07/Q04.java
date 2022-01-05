package homework.chapter07;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter grades between 0-100(Inputs end with <0): ");
        int[] grades = new int[100];
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < grades.length; i++) {
            int num = scanner.nextInt();

            if (num < 0) break;

            else grades[i] = num;
            sum += num;
            counter++;
        }
        double average = (double) sum / counter;
        getAnalyze(grades, average, counter);
    }
    private static void getAnalyze(int[] grades, double average, int counter) {

        int aboveAverage = 0;
        int belowAverage = 0;
        int equalAverage = 0;

        for (int i = 0; i < counter; i++) {
            if (grades[i] > average) {
                aboveAverage++;
            } else if (grades[i] < average) {
                belowAverage++;
            } else equalAverage++;
        }
        System.out.println("Average is " + average);
        System.out.println(aboveAverage + " numbers above the average");
        System.out.println(belowAverage + " numbers below the average");
        System.out.println(equalAverage + " numbers equal the average");
    }
}





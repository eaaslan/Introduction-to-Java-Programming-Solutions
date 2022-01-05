package homework.chapter06;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        displaySortedNumbers(num1,num2,num3);
    }
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp;
        if (num1 < num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num3 > num2) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 < num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println(num1 + ">" + num2 + ">" + num3);
    }
}
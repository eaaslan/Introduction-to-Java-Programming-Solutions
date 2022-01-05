package homework.chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter list1(first numbers is determines array size) : ");
        int[] list1 = new int[scanner.nextInt()];
        for (int i = 0; i < list1.length; i++)
            list1[i] = scanner.nextInt();

        System.out.println("Enter list2(first numbers is determines array size) : ");
        int[] list2 = new int[scanner.nextInt()];
        for (int i = 0; i < list2.length; i++)
            list2[i] = scanner.nextInt();

        if (equals(list1, list2))
            System.out.println("Two lists are strictly identical");
        else
            System.out.println("Two lists are not strictly identical");

    }

    public static boolean equals(int[] list1, int[] list2) {
        int[] listOneCheck = new int[10];
        int[] listTwoCheck = new int[10];

        for (int i : list1) {
            listOneCheck[i]++;
        }
        for (int j : list2) {
            listTwoCheck[j]++;
        }
        return Arrays.equals(list1, list2);
    }
}
//    boolean check = false;
//        for (int i = 0; i < list1.length; i++) {
//        int currentMin = list1[i];
//        int currentMinIndex = i;
//
//        for (int j = i + 1; j < list1.length; j++) {
//        if (currentMin > list1[j]) {
//        currentMin = list1[j];
//        currentMinIndex = j;
//        }
//        }
//        if (currentMinIndex != i) {
//        list1[currentMinIndex] = list1[i];
//        list1[i] = currentMin;
//        }
//        }
//        for (int i = 0; i < list2.length; i++) {
//        int currentMin = list2[i];
//        int currentMinIndex = i;
//
//        for (int j = i + 1; j < list2.length; j++) {
//        if (currentMin > list2[j]) {
//        currentMin = list2[j];
//        currentMinIndex = j;
//        }
//        }
//        if (currentMinIndex != i) {
//        list2[currentMinIndex] = list2[i];
//        list2[i] = currentMin;
//        }
//        }
//
//        if (list1.length == list2.length) {
//        for (int i = 0; i < list1.length; i++) {
//        check = list1[i] == list2[i];
//        }
//        } else {
//        System.out.println("Array sizes are not equal");
//        System.exit(0);
//        }
//        return check;

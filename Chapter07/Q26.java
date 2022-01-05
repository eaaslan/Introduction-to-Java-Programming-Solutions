package homework.chapter07;

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter list1(first numbers is determines array size) : ");
        int[] list1 = new int[scanner.nextInt()];
        for (int i = 0; i < list1.length; i++)
            list1[i] = scanner.nextInt();
        System.out.println("Enter list1(first numbers is determines array size) : ");
        int[] list2 = new int[scanner.nextInt()];
        for (int i = 0; i < list2.length; i++)
            list2[i] = scanner.nextInt();

        if (equals(list1, list2)) {
            System.out.println("Two lists are strictly identical");
        } else {
            System.out.println("Two lists are not strictly identical");
        }
    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }
}



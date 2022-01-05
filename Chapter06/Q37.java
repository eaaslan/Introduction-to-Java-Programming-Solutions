package homework.chapter06;

import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int numOfSide = scanner.nextInt();
        System.out.print("Enter the width: ");
        int side = scanner.nextInt();
        format(numOfSide, side);
    }

    public static void format(int number, int width) {
        String str = number + "";
        for (int i = str.length(); i < width; i++) {
            str = "0" + str;
        }
        System.out.println(str);
    }
}


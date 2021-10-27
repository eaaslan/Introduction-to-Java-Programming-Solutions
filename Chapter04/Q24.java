package homework.chapter04;

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String city1 = scanner.nextLine();
        System.out.println("Enter the second city: ");
        String city2 = scanner.nextLine();
        System.out.println("Enter the third city: ");
        String city3 = scanner.nextLine();

        if (city1.compareTo(city2) > 0) {
            String temp = city1;
            city1 = city2;
            city2 = temp;
        }
        if (city2.compareTo(city3) > 0) {
            String temp = city2;
            city2 = city3;
            city3 = temp;
        }
        if (city1.compareTo(city2) > 0) {
            String temp = city1;
            city1 = city2;
            city2 = temp;
        }

        System.out.println(city1 + " and " + city2 + " and " + city3);
    }
}

package homework.chapter03;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the edges of triangle: ");
        int edge1 = scanner.nextInt();
        int edge2 = scanner.nextInt();
        int edge3 = scanner.nextInt();

        if ((edge1 + edge2 > edge3) && (edge3 + edge2 > edge1) && (edge3 + edge1 > edge2)) {
            System.out.println("Input is valid");
        } else {
            System.out.println("Input is invalid");
        }
    }
}

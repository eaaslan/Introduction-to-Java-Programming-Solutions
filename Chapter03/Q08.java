package homework.chapter03;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (b > a) { //swap a and b   //a > b > c order
            int temp = a;
            a = b;
            b = temp;
        }
        if (c > b) {
            int temp = b;
            b = c;
            c = temp;
        }
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.println(a + ">" + b + ">" + c);
    }
}

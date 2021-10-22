package homework.chapter03;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the  amount: ");
        double money = scanner.nextDouble();
        System.out.print("Enter the exchange rate from dollars to TL: ");
        double exchange = scanner.nextDouble();
        System.out.print("Enter 0 to convert dollars to TL and 1 vice versa: ");
        double type = scanner.nextDouble();

        //1 dollar to lira
        if (type == 1) {
            System.out.print("$" + money + " is ");
            money *= exchange;
            System.out.println(money + " TL");
        } else if (type == 0) { //  lira to dollar
            System.out.println("TL" + money + " is ");
            money *= exchange;
            System.out.println(money + " $");
        } else {
            System.out.println("Incorrect input");
        }
    }
}

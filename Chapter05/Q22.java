package homework.chapter05;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double anapara = scanner.nextInt();
        System.out.print("Number of Years: ");
        int yilSayisi = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        double faiz = scanner.nextInt();

        double aylikFaizOrani = faiz / 1200;
        double aylikOdeme = anapara * aylikFaizOrani / (1 - 1 /
                Math.pow(1 + aylikFaizOrani, yilSayisi * 12));

        double bakiye = anapara;

        System.out.printf("\n\nMonthly Payment:%3.2f \n",aylikOdeme);
        System.out.printf("Total Payment:%6.2f \n\n\n",aylikOdeme*12);
        System.out.println("Payment#   Interest      Principal      Balance");
        for (int i = 1; i <= yilSayisi * 12; i++) {
            faiz = aylikFaizOrani * bakiye;
            anapara = aylikOdeme - faiz;
            bakiye = bakiye - anapara;
            System.out.printf("%2d\t\t\t%5.2f\t\t%8.2f\t%11.2f\n",i  ,faiz , anapara , bakiye);
        }
    }
}

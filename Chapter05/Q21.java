package homework.chapter05;
import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        int amount = scanner.nextInt();
        System.out.print("Number of Years: ");
        int years = scanner.nextInt();

        System.out.println("Interest Rate    Monthly Payment    Total Payment");

        for (double i = 0; i < 25; i++) {
            double interestRate = 5 + (i * (0.125));
            double monthlyInterestRate = (interestRate / 1200);
            double monthlyPayment = amount * monthlyInterestRate / (1
                    - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
            double totalPayment = monthlyPayment * years * 12;

            System.out.printf("\t%1.3f\t\t%11.2f\t\t%14.2f\n", interestRate,monthlyPayment,totalPayment); // interestRate in sonuna % işareti koyma
        }
    }
}

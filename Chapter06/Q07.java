package homework.chapter06;
import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int YEAR = 30;
        System.out.print("The amount invested: ");
        double investment = scanner.nextDouble();
        System.out.print("Annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200;
        System.out.println("Years    Future Value");
        for (int i = 1; i <= YEAR; i++) {
            System.out.printf("%3d",i);
            System.out.printf("%13.2f\n",futureInvestmentValue(investment,monthlyInterestRate,i));
        }
    }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}

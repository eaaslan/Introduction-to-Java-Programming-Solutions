package homework.chapter04;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        int hours = scanner.nextInt();
        System.out.print("Enter hourly pay rate:");
        double payRate = scanner.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double fedTax = scanner.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = scanner.nextDouble();

        double grossPay = hours * payRate;
        double fedWith = (grossPay * fedTax);
        double stateWith = (grossPay * stateTax);

        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate:  " + payRate);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Deductions:");
        System.out.println("Federal Withholding (" + fedTax * 100.0 + "%): " + fedWith);
        System.out.println("State Withholding (" + stateTax * 100.0 + "%): " + stateWith);
        System.out.println("Total Deduction: " + (fedWith + stateTax));
        System.out.println("Net Pay : " + (grossPay - (fedWith + stateWith)));

    }
}

package homework.chapter05;

public class Q42 {
    public static void main(String[] args) {

        final double BASE_SALARY = 5_000;
        final double MAX_MONEY = 30_000;
        double commision = 0;
        int totalSales = 1;

        do {
            totalSales++;

            if (totalSales < 5000) {
                commision = totalSales * 0.08;
            } else if (totalSales < 10000) {
                commision = 5000 * 0.08 + (totalSales - 5000) * 0.10;
            } else {
                commision = 5000 * 0.08 + 5000 * 0.10 + (totalSales - 10000) * 0.12;
            }
        } while (commision < MAX_MONEY - BASE_SALARY);
        System.out.println("Total sales: " + totalSales + " and total comision: " + commision);
    }
}

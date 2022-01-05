package homework.chapter06;
public class Q11 {

    public static void main(String[] args) {
        System.out.println("   Sales Amount   Commission");
        for (int i = 10000; i <= 100000; i += 5000) {
            System.out.printf("%10d%15.1f\n", i, computeCommission(i));
        }
    }
    public static double computeCommission(double salesAmount) {
        double commission = 0;
        commission = (5000 * 0.08) + (5000 * 0.1) + (salesAmount - 10000) * 0.12;
        return commission;
    }
}
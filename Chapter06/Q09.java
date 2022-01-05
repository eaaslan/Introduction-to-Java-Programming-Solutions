package homework.chapter06;

public class Q09 {
    public static void main(String[] args) {

        System.out.println("Feet       Meters   | Meters         Feet");
        System.out.println("-------------------------------------------");

        for (double i = 1,j=20; i <= 10; i++,j+=5) {
            System.out.printf("%4.1f    ",i);
            System.out.printf("%8.2f    ",footToMeter(i));
            System.out.print("|  "+j+"  ");
            System.out.printf("%12.3f\n",meterToFoot(j));
        }
    }
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
}

package homework.chapter05;

public class Q05 {
    public static void main(String[] args) {

        final double POUND = 2.2;
        System.out.println("Kilograms Pounds | Pounds Kilograms");
        for (int i = 1, j = 20; i <= 199; i += 2, j += 5) {
            System.out.printf("%3d%11.1f ", i, (i * POUND));

            System.out.print("  |   ");
            System.out.printf("%3d%12.2f\n", j, (j / POUND));
        }
    }
}

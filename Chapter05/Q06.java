package homework.chapter05;

public class Q06 {

    public static void main(String[] args) {

        final double POUND_PER_KILOGRAM = 2.2;
        final double KILOGRAM_PER_POUND = 0.45359237;

        System.out.println("Kilograms Pounds |  Pounds     Kilograms   ");

        for (int k = 1, p = 20; k <= 199; k += 2, p += 5) {
            System.out.printf("%3d%11.1f ", k, (k * POUND_PER_KILOGRAM));

            System.out.print("  |   ");
            System.out.printf("%3d%12.2f\n", p, (p / KILOGRAM_PER_POUND));
        }
    }
}
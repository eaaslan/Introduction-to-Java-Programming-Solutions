package homework.chapter05;

public class Q03 {
    public static void main(String[] args) {

        final double POUND_PER_KILOGRAM = 2.2;
        int kilograms = 1;
        System.out.println("Kilograms "+"\t"+"Pounds");

        while (kilograms < 200) {
            System.out.printf("%4d%13.2f\n", kilograms, kilograms * POUND_PER_KILOGRAM);
            kilograms++;
        }
    }
}

package homework.chapter07;

public class Q14 {
    public static void main(String[] args) {

        int[] numbers = {33, 99, 66,132};
        System.out.println(gcd(numbers));
    }
    public static int gcd(int... numbers) {
        int min = numbers[0];
        int gcd = 0;
        int counter = 0;
        int div = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        for (int i = 0; i < min; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] % div == 0) {
                    counter++;
                }
            }
            if ((counter) == numbers.length) {
                gcd = div;
            }
            counter = 0;
            div++;
        }
        return gcd;
    }
}

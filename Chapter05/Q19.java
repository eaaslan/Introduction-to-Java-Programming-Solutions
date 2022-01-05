package homework.chapter05;

public class Q19 {
    public static void main(String[] args) {
        int spaces = 7;
        int decreasing = 0;
        for (int i = 1; i <= 128; i += i) { //columns

            for (int k = 0; k < spaces; k++) { // reduce two for one space and one number
                System.out.print("    ");
            }
            spaces--;

            for (int j = 1; j <= i; j *= 2) { // increasing
                System.out.printf("%4d", j);
                decreasing = j;
            }

            for (int k = decreasing / 2; k >= 1; k /= 2) { // decreasing
                System.out.printf("%4d", k);
            }
            System.out.println();
        }
    }
}

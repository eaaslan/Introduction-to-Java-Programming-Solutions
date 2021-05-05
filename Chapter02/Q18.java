/*
(Print a table) Write a program that displays the following table. Cast floating point numbers into integers.
a b pow(a, b)
1 2 1
2 3 8
3 4 81
4 5 1024
5 6 15625
 */
package homework.chapter02;

public class Q18 {
    public static void main(String[] args) {

        int b = 1;
        System.out.println(" a" + "    " + "b" + " " + "Math.pow(a,b)");

        for (int a = 1; a < 6; a++) {
            b++;
            System.out.printf("%2d %4d %6.0f\n", a, b, Math.pow(a, b));
        }
    }
}

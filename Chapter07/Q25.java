package homework.chapter07;

import java.util.Scanner;

public class Q25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] eqn = new double[3];
        double[] roots = new double[2];
        System.out.print("Enter a, b, c: ");
        for (int i = 0; i < 3; i++) {
            eqn[i] = scanner.nextInt();
        }
        int numberOfRoot = solveQuadratic(eqn, roots);

        if (numberOfRoot == 2) {
            System.out.print("The equation has two roots ");
            System.out.println("Root1 is " + roots[0]);
            System.out.println("Root2 is " + roots[1]);
        } else if (numberOfRoot == 1) {
            System.out.print("The equation has one root ");
            System.out.println("Root is " + roots[0]);
        } else {
            System.out.println("The equation has no real roots ");
        }
    }
    public static int solveQuadratic(double[] eqn, double[] roots) {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];

        double discriminant = (Math.pow(b, 2)) - 4 * a * c;
        double r1 = ((-b) + Math.pow(discriminant, 0.5)) / 2 * a;
        double r2 = ((-b) - Math.pow(discriminant, 0.5)) / 2 * a;

        if (discriminant > 0) {
            roots[0] = r1;
            roots[1] = r2;
            return 2;

        } else if (discriminant == 0) {
            roots[0] = r1;
            return 1;
        }
        return -1;
    }
}

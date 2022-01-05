package homework.chapter09.Q10;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getDiscriminant() {
        double discriminant = b * b - (4 * a * c);
        ;
        return discriminant;
    }

    double getRoot1() {
        if (getDiscriminant() == 0) {
            return 0;
        }
        return (-b + (Math.pow(b * b - 4 * a * c, 0.5))) / 2 * a;
    }

    double getRoot2() {
        if (getDiscriminant() == 0) {
            return 0;
        }

        return (-b - (Math.pow(b * b - 4 * a * c, 0.5))) / 2 * a;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }


}

package homework.chapter09.Q12;

public class IntersectingPoint {

    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    private double x4;
    private double y4;


    public IntersectingPoint(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }

    void setOrder() {

        double a = y1 - y2;
        double b = -(x1 - x2);
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double c = (y3 - y4);
        double d = -(x3 - x4);
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        calculate(a, b, e, c, d, f);
    }

    void calculate(double a, double b, double e, double c, double d, double f) {
        if (a * d - b * c == 0) {
            System.out.println("The two lines are parallel");
        }
        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);
        System.out.println("The intersecting point is at (" + x + ", " + y + ")");

    }
}

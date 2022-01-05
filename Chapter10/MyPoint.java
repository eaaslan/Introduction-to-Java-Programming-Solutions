package chapter10;

public class MyPoint {

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distance(double x, double y) {

        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    double distance(MyPoint myPoint) {
        return distance(myPoint.getX(), myPoint.getY());
    }

}

class TestMyPoint {
    public static void main(String[] args) {

        MyPoint myPoint1 = new MyPoint(0, 0);
        MyPoint myPoint2 = new MyPoint(10, 30.5);

        System.out.println(myPoint1.distance(myPoint2));
        System.out.println(myPoint1.distance(10, 30.5));
    }
}

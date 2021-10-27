package homework.chapter04;

public class Q03 {
    public static void main(String[] args) {

        // Atlanta 33.7490987 , -84.3901849
        // Orlando 28.5421109 , -81.3790304
        // Savannah 32.0809263 , 81.0911768
        // Charlotte 35.2272086 , 80.8430827

        final double RADIUS = 6371.01;

        double x1 = Math.toRadians(33.7490987);
        double y1 = Math.toRadians(-84.3901849);
        double x2 = Math.toRadians(28.5421109);
        double y2 = Math.toRadians(-81.3790304);
        double x3 = Math.toRadians(32.0809263);
        double y3 = Math.toRadians(81.0911768);
        double x4 = Math.toRadians(35.2272086);
        double y4 = Math.toRadians(80.8430827);

        double d = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) *
                Math.cos(x2) * Math.cos(y1 - y2));

        System.out.println(d);
        double side1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double side2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double a = Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2);
        double side3 = Math.sqrt(a);
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        // Calculating 2nd triangle; p1, p3 and, p4

        side1 = Math.sqrt(a);
        side2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        side3 = Math.sqrt(Math.pow(x1 - x4, 2) + Math.pow(y1 - y4, 2));
        s = (side1 + side2 + side3) / 2;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)) + area;

        System.out.print("The area enclosed by 4 cities is " + area + " km^2");
    }
}

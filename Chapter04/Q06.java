package homework.chapter04;

public class Q06 {
    public static void main(String[] args) {
        double r = 40;

        for (int i = 0; i < 3; i++) {
            double angle1 = Math.random() * 2 * Math.PI;
            double x1 = r * Math.cos(angle1);
            double y1 = r * Math.sin(angle1);

            System.out.println("(" + x1 + ", " + y1 + ")");
        }
    }
}

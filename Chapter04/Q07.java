package homework.chapter04;

public class Q07 {
    public static void main(String[] args) {
        double r = 100;

        for (int i = 0; i < 5; i++) {
            double angle = i * 72 + 18;
            double x = r * Math.cos(Math.toRadians(angle));
            double y = r * Math.sin(Math.toRadians(angle));

            System.out.println("(" + x + ", " + y + ")");
        }
    }
}

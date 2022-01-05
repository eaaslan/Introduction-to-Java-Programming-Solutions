package homework.chapter09.Q11;

public class TestLinearEquation {
    public static void main(String[] args) {
        LinearEquation linearEquation = new LinearEquation(1, 2, 2, 4, 5, 6);

        if (!linearEquation.isSolvable()) {
            System.out.println("The equation has no solution.");
        }
        else {
            System.out.printf("x: %3.2f \t",linearEquation.getX());
            System.out.printf("y: %3.2f \t",linearEquation.getY());
        }
    }
}

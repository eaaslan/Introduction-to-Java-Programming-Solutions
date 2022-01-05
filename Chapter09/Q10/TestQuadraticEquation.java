package homework.chapter09.Q10;

import homework.chapter09.Q10.QuadraticEquation;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        QuadraticEquation quadraticEquation;
        quadraticEquation = new QuadraticEquation(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        System.out.println(quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.printf("%3.2f root 1 is: \n",quadraticEquation.getRoot1());
            System.out.printf("%3.2f \nroot 2 is: ",quadraticEquation.getRoot2());
        }
        else if (quadraticEquation.getDiscriminant()==0){
            System.out.printf("%3.2f root 1 is: \n",quadraticEquation.getRoot1());
        }
        else {
            System.out.println("The equation has no roots.");
        }
    }
}

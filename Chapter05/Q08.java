package homework.chapter05;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students");
        int numOfSt = scanner.nextInt();

        int bestScore = 0;
        String bestScoreName = "";
        for (int i = 0; i < numOfSt; i++) {
            System.out.print("Student: " + (i + 1) + "\n   Name: ");
            String name = scanner.next();
            System.out.print("   Score: ");
            int score = scanner.nextInt();

            if (score > bestScore) {
                bestScore = score;
                bestScoreName = name;
            }
        }
        System.out.println("The best score belong to " + bestScoreName + " and his/her score is " + bestScore);
    }
}

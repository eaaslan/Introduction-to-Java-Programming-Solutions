package homework.chapter05;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int numOfSt = scanner.nextInt();
        int bestScore = 0;
        int secondBestScore = 0;
        String bestScoreName = "";
        String secondBestScoreName = "";
        for (int i = 0; i < numOfSt; i++) {

            System.out.print("Student: " + (i + 1) + "\n   Name: ");
            String name = scanner.next();
            System.out.print("   Score: ");
            int score = scanner.nextInt();

            if (score > bestScore) {
                secondBestScore = bestScore;
                secondBestScoreName = bestScoreName;

                bestScore = score;
                bestScoreName = name;

            } else if (score > secondBestScore) {
                secondBestScore = score;
                secondBestScoreName = name;
            }
        }

        System.out.println("The best score belong to " + bestScoreName + " and his/her score is " + bestScore);
        System.out.println("and the second best core belong to " + secondBestScoreName + " and his /her score is " + secondBestScore);

    }
}

package homework.chapter08;

public class Q03 {
    public static void main(String[] args) {

        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[][] grades = new int[answers.length][2];
        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {

                if (answers[i][j] == keys[j]) {
                    correctCount++;
                }
            }
            grades[i][0] = i + 100;
            grades[i][1] = correctCount;
        }

        sort(grades);

        for (int j = 0; j < grades.length; j++) {
            System.out.println("Student " + grades[j][0] + "'s correct count is " +
                    grades[j][1]);
        }
    }

    private static void sort(int[][] grades) {
        for (int i = 0; i < grades.length; i++) {
            int currentMinIndex = i;
            int[] currentMin = grades[i];

            for (int j = i + 1; j < grades.length; j++) {
                if (currentMin[1] < grades[j][1]) {
                    currentMinIndex = j;
                    currentMin = grades[j];
                }
            }
            if (currentMinIndex != i) {
                grades[currentMinIndex] = grades[i];
                grades[i] = currentMin;
            }
        }
    }
}
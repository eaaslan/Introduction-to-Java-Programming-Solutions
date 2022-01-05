package homework.chapter08;

public class Q04 {
    public static void main(String[] args) {

        int[][] weeklyHours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9},
        };

        int[][] sum = new int[8][2];

        for (int i = 0; i < weeklyHours.length; i++) {
            sum[i][0] = i;
            for (int j = 0; j < weeklyHours[i].length; j++) {
                sum[i][1] += weeklyHours[i][j];
            }
        }
        selectionSort(sum);

        for (int i = 0; i < sum.length; i++) {
            System.out.println("Employees " + sum[i][0] + " have " + sum[i][1] + " total hours");
        }
    }

    public static void selectionSort(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            int currentMin = matrix[i][1];
            int currentStudent = matrix[i][1];
            int currentMinIndex = i;

            for (int j = i + 1; j < matrix.length; j++) {
                if (currentMin < matrix[j][1]) {
                    currentMin = matrix[j][1];
                    currentStudent = matrix[j][0];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                matrix[currentMinIndex][1] = matrix[i][1];
                matrix[currentMinIndex][0] = matrix[i][0];

                matrix[i][1] = currentMin;
                matrix[i][0] = currentStudent;
            }
        }
    }
}

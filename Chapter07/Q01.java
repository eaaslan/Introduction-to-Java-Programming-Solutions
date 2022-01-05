package homework.chapter07;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int[] grades = new int[scanner.nextInt()];

        getAssign(scanner, grades);
        assignGrades(grades, getBest(grades));
    }
    private static void assignGrades(int[] grades, int best) {
        int A = best;
        char[] grade = new char[grades.length];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= best - 10) {
                grade[i] = 'A';
            } else if (grades[i] >= best - 20) {
                grade[i] = 'B';
            } else if (grades[i] >= best - 30) {
                grade[i] = 'C';
            } else if (grades[i] >= best - 40) {
                grade[i] = 'D';
            } else
                grade[i] = 'F';
        }
        for (int i = 0; i < grade.length; i++) {
            System.out.println("Student " + i + " is " + grades[i] + " and grade is " + grade[i]);
        }
    }
    private static int getBest(int[] grades) {
        int best = 0;
        for (int grade : grades)
            if (grade > best)
                best = grade;

        return best;
    }
    private static void getAssign(Scanner scanner, int[] grades) {
        System.out.print("Enter 4 scores: ");
        for (int i = 0; i < grades.length; i++) {
            grades[i] = scanner.nextInt();
        }
    }
}

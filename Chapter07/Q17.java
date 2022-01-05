package homework.chapter07;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        String[] names = new String[scanner.nextInt()];
        int[] grades = new int[names.length];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Name: ");
            names[i] = scanner.next(); // neden nextLine yaptığımız zaman outOfBound hatası alıyoruz ?
            System.out.print("Grade: ");
            grades[i] = scanner.nextInt();
        }
        rankGrade(grades, names);
    }

    public static void rankGrade(int[] grades, String[] names) {

        for (int i = 0; i < grades.length - 1; i++) {
            int currentMin = grades[i];
            int currentMinIndex = i;
            String currentMinStr = names[i];

            for (int j = i + 1; j < grades.length; j++) {
                if (grades[j] < currentMin) {
                    currentMin = grades[j];
                    currentMinStr = names[j];
                    currentMinIndex = j;
                }
            }
            if (currentMin != grades[i]) {
                grades[currentMinIndex] = grades[i];
                grades[i] = currentMin;
                names[currentMinIndex] = names[i];
                names[i] = currentMinStr;
            }
        }
        for (int k = 0; k < grades.length; k++) {
            System.out.println(names[k] + " " + grades[k]);
        }
    }
}

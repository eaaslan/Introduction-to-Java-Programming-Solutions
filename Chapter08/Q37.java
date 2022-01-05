package homework.chapter08;

import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] matrix = {
                {"Alabama", "Montgomery"},
                {"Alaska", "Juneau"},
                {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"},
                {"California", "Sacramento"},
                {"Colorado", "Denver"},
                {"Connecticut", "Hartford"},
                {"Delaware", "Dover"},
                {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"},
                {"Hawaii", "Honolulu"},
                {"Idaho", "Boise"},
                {"Illinois", "Springfield"},
                {"Maryland", "Annapolis"},
                {"Minnesota", "Saint Paul"},
                {"Iowa", "Des Moines"},
                {"Maine", "Augusta"},
                {"Kentucky", "Frankfort"},
                {"Indiana", "Indianapolis"},
                {"Kansas", "Topeka"},
                {"Louisiana", "Baton Rouge"},
                {"Oregon", "Salem"},
                {"Oklahoma", "Oklahoma City"},
                {"Ohio", "Columbus"},
                {"North Dakota", "Bismark"},
                {"New York", "Albany"},
                {"New Mexico", "Santa Fe"},
                {"New Jersey", "Trenton"},
                {"New Hampshire", "Concord"},
                {"Nevada", "Carson City"},
                {"Nebraska", "Lincoln"},
                {"Montana", "Helena"},
                {"North Carolina", "Raleigh"},
                {"Missouri", "Jefferson City"},
                {"Mississippi", "Jackson"},
                {"Massachusetts", "Boston"},
                {"Michigan", "Lansing"},
                {"Pennsylvania", "Harrisburg"},
                {"Rhode Island", "Providence"},
                {"South Carolina", "Columbia"},
                {"South Dakota", "Pierre"},
                {"Tennessee", "Nashville"},
                {"Texas", "Austin"},
                {"Utah", "Salt Lake City"},
                {"Vermont", "Montpelier"},
                {"Virginia", "Richmond"},
                {"Washington", "Olympia"},
                {"West Virginia", "Charleston"},
                {"Wisconsin", "Madison"},
                {"Wyoming", "Cheyenne"}};

        int correctCounter = 0;
        for (String[] strings : matrix) {
            System.out.print("What is the capital of ");
            System.out.println(strings[0]);
            String answer = scanner.next();
            if (strings[1].equals(answer)) {
                System.out.println("Your answer is correct ");
                correctCounter++;
            } else {
                System.out.print("The correct answer should be ");
                System.out.println(strings[1]);
            }
        }
        System.out.print("The correct count is ");
        System.out.print(correctCounter);
    }
}


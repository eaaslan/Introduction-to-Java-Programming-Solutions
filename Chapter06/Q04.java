package homework.chapter06;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scanner.nextInt();
        displayReverse(num);
    }

    public static void displayReverse(int number){
        String str = number + "";
        String newNumber = "";
        for (int i = str.length(); i > 0; i--) {
            newNumber += str.charAt(i - 1);
        }
        System.out.println(newNumber);
    }
}

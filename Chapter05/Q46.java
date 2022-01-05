package homework.chapter05;
import java.util.Scanner;
public class Q46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string ");
        String string = scanner.nextLine();

        String black = "";

        for (int i = (string.length()) - 1; i >= 0; i--) {
            black += string.charAt(i);
        }
        System.out.println(black);
    }
}

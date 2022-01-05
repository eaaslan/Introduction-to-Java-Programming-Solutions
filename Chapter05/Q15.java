package homework.chapter05;

public class Q15 {

    public static void main(String[] args) {
        int counter = 0;
        for (char i = '!'; i <= '~'; i++) {
            System.out.print(i + "\t");
            counter++;
            if (counter % 10 == 0)
                System.out.println();

        }
    }
}

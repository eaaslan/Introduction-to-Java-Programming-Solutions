package homework.chapter05;

public class Q27 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 101; i <= 2100; i++) {

            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                System.out.print(i + " ");
                counter++;
                if (counter == 10) {
                    System.out.println("");
                    counter = 0;
                }
            }
        }
    }
}

package homework.chapter05;

public class Q10 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                if (counter % 10 == 0) {
                    System.out.println();
                }
                counter++;

                System.out.print(i + "\t");
            }
        }
    }
}

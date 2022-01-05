package homework.chapter07;

public class Q23 {
    public static void main(String[] args) {
        boolean[] locker = new boolean[101];

        for (int i = 1; i < 101; i++) {
            for (int j = i; j < 101; j += i) {
                locker[j] = !locker[j];
            }
        }
        for (int i = 1; i < locker.length; i++) {
            if (locker[i]) {
                System.out.println("index " + i + " is true");
            }
        }
    }
}

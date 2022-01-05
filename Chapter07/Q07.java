package homework.chapter07;

public class Q07 {
    public static void main(String[] args) {

        int[] counts = new int[10];

        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random() * 10);
            counts[random]++;
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.printf("%3d ", i);
            System.out.println("times " + counts[i]);
        }
    }
}

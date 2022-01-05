package homework.chapter05;

public class Q40 {
    public static void main(String[] args) throws InterruptedException {
        int head = 0;
        int tail = 0;
        System.out.println(" flipping a coin one million times....");
        Thread.sleep(5000);

        for (int i = 1; i <= 1_000_000; i++) {
            int hot = (int) (Math.random() * 2);
            if (hot == 0) {
                head++;
            } else {
                tail++;
            }
        }
        System.out.println("The number of heads is " + head);
        System.out.println("The number of tails is " + tail);


    }
}

package homework.chapter09;
import java.util.Random;

public class Q04 {

    public static void main(String[] args) {

        Random random = new Random(1000);

        for (int i = 0; i < 50; i++) {
            System.out.printf("%4d",random.nextInt(100));
            if((1+i)%10==0){
                System.out.println();
            }
        }
    }
}

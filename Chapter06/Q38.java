package homework.chapter06;
import book.chapter6.RandomCharacter;
public class Q38 {
    public static void main(String[] args) {

        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < 100; i++) {
            System.out.print(RandomCharacter.getRandomUpperCaseLetter() + " ");
            counter1++;
            if (counter1 == 10) {
                System.out.println();
                counter1 = 0;
            }
        }
        for (int i = 0; i < 100; i++) {
            System.out.print(RandomCharacter.getRandomDigitCharacter() + " ");
            counter1++;
            if (counter1 == 10) {
                System.out.println();
                counter1 = 0;
            }
        }
    }
}


// karisik yazilacak

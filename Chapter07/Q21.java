package homework.chapter07;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Q21 {
    public static void main(String[] args) {

        int numberOfSlots = 8;
        int numberOfBalls = 5;

        int[] slots = new int[numberOfSlots];
        String[] path = new String[numberOfBalls];

        for (int k = 0; k < numberOfBalls; k++) {
            int rightCounter = 0;
            path[k] = "";
            for (int i = 0; i < numberOfSlots; i++) {
                int direction = (int) (Math.random() * 2);
                if (direction == 1) { //0 means left
                    rightCounter++;
                    path[k] += "R";
                } else {
                    path[k] += "L";
                }
            }
            slots[rightCounter]++;
        }

        for (String p : path) { // How many balls are in which index
            System.out.println(p);
        }

        for (int k : slots) { // How many balls are in which index
            System.out.print(k + " ");
        }

        int max = IntStream.of(slots).max().getAsInt();

        System.out.println();
        for (int i = max; i > 0; i--) { // anlamadım
            String output = "";
            for (int j = 0; j < slots.length; j++) {
                if (slots[j] == i) {
                    output += "O";
                    slots[j]--;
                } else {
                    output += "-";
                }
            }
            System.out.println(output);
        }
    }
}
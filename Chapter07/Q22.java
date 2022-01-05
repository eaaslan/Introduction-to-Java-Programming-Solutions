package homework.chapter07;

import java.util.Arrays;

public class Q22 {

    public static void main(String[] args) {
        final char QUEEN = 'Q';
        final char CLOSED = 'C';
        final char EMPTY = ' ';

        char[] array = new char[8 * 8];
        Arrays.fill(array, ' ');
        int col = 0;
        int counter = 0;
        while (true) {
            for (int i = 0; i < 8; ) {
                int location = col + ((int) (Math.random() * 8));

                if (array[location] == EMPTY) {
                    counter = 0;
                    array[location] = QUEEN;
                    int xStart = (location / 8) * 8;
                    int xEnd = xStart + 7;
                    for (int j = xStart; j <= xEnd; j++) {
                        if (array[j] == EMPTY) {
                            array[j] = CLOSED;
                        }
                    }

                    int zLeftDownEnd = location % 8;
                    for (int x = 0, j = location; x < zLeftDownEnd; x++) {
                        if (j < 56) {
                            j += 7;

                            if (array[j] == EMPTY) {
                                array[j] = CLOSED;
                            }
                        } else break;
                    }

                    int zRightDownEnd = 7 - (location % 8);
                    for (int x = 0, j = location; x < zRightDownEnd; x++) {
                        if (j < 56) {
                            j += 9;

                            if (array[j] == EMPTY) {
                                array[j] = CLOSED;
                            }
                        } else break;

                    }

                    int yStart = location % 8;
                    int yEnd = yStart + (7 * 8);
                    for (int j = location; j <= yEnd; j += 8) {
                        if (array[j] == EMPTY) {
                            array[j] = CLOSED;
                        }
                    }

                    i++;
                    col += 8;
                } else counter++;

                if (counter == 100) break;

            }

            if (counter == 100) {
                array = new char[8 * 8];
                Arrays.fill(array, ' ');
                col = 0;
                counter = 0;
            } else {
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print("|" + array[i] + "");
            if ((i + 1) % 8 == 0) {
                System.out.print("|");
                System.out.println();

            }
        }
//        System.out.println(Arrays.toString(array));

    }
    // rassal bir yer sec ve oraya veziri yerlestirs
    // vezirin gidebilecegi yerlere arrayde de CLOSED ata
    // rassal baska bir noktaya vezir ata ama orasi QUEEN yada CLOSED ise baska index dene. Bulunca 2. adıma zıpla
    // 100 kere deneyip hala yerlestiremediysen soruya yeninden basla
}


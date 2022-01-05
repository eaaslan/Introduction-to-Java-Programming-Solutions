package homework.chapter06;

public class Q12 {

    public static void main(String[] args) {
        printChars('1', 'Z', 10);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {
        if (ch2 < ch1) {
            char temp = ch1;
            ch1 = ch2;
            ch2 = temp;
        }

        int counter = 0;
        for (char i = ch1; i < ch2; i++) {
            System.out.print(i + " ");
            if (++counter % numberPerLine == 0) {
                System.out.println();
            }
        }
    }
}

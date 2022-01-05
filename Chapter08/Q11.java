package homework.chapter08;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 511: ");
        String binary = decToBinary(scanner.nextInt());

        for (int i = 0; i < binary.length(); i++) {

            if (binary.charAt(i) == '0') {
                System.out.print("H  ");
            } else System.out.print("T  ");

            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
    }

/*
  if (sayi & (1 << 3) == 0)
            sayi = sayi | (1 << 3);
        else
            sayi = sayi & ~(1 << 3);

    1010 1111 0101 1010 1010 1111 0101 1010
   //  0000 0000 0000 0000 0000 0000 0000 1000
    1111 1111 1111 1111 1111 1111 1111 0111
  & ---------------------------------------
    1010 1111 0101 1010 1010 1111 0101 0010

 */



    public static String decToBinary(int n) {
        String binary = "";
        for (int i = 8; i >= 0; i--) {
            int k = n >> i; // anlamadım
            if ((k & 1) > 0)
                binary += "1";
            else
                binary += "0";
        }
        return binary;
    }
}

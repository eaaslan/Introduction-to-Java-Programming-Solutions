package homework.chapter06;

public class Q27 {
    public static void main(String[] args) {
        int num = 10;
        int emirpNum = 0;
        while (emirpNum < 100) {
            if (isPrime(num) && isPrime(reverse(num))) {
                System.out.print(num+" ");
                emirpNum++;
                if (emirpNum % 10 == 0)
                    System.out.println();
            }
            num++;
        }
    }
    public static boolean isPrime(int num) {
        int div = 1;
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            if (num % div == 0) {
                counter++;
            }
            div++;
        }
        return counter == 2;
    }
    public static int reverse(int num) {
        String str = num + "";
        String newNum = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newNum += str.charAt(i);
        }
        return Integer.parseInt(newNum);
    }
}
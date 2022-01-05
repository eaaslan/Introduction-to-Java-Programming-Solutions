package homework.chapter06;

public class Q26 {
    public static void main(String[] args) {
        int palindromicPrime = 100;
        int num = 1;

        while (palindromicPrime != 0) {
            if (isPrime(num) && isPalindrome(num)) {
                System.out.printf("%6d", num);
                palindromicPrime--;

                if (palindromicPrime % 10 == 0)
                    System.out.println();
            }
            num++;
        }
    }

    public static boolean isPrime(int num) {
        int counter = 0;
        int div = 1;
        for (int i = 1; i <= num; i++) {
            if (num % div == 0) {
                counter++;
            }
            div++;
        }
        return counter == 2;
    }

    public static boolean isPalindrome(int num) {
        String strNum = num + "";
        String newStrNum = "";
        for (int i = strNum.length() - 1; i >= 0; i--) {
            newStrNum += strNum.charAt(i);
        }
        return newStrNum.equals(strNum);
    }
}

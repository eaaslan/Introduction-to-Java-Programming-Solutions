package homework.chapter10;

public class MyInteger {

    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    boolean isEven() {

        return isEven(value);
    }

    boolean isOdd() {

        return isOdd(value);
    }

    boolean isPrime() {
        return isPrime(value);
    }

    public static boolean isEven(int value) {

        return (value % 2 == 0);
    }

    public static boolean isOdd(int value) {

        return (value % 2 != 0);
    }

    public static boolean isPrime(int value) {
        if (value < 2) return false;
        for (int i = 2; i < value / 2; i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger) {

        return myInteger.isEven();
    }

    public static boolean isOdd(MyInteger myInteger) {

        return myInteger.isOdd();
    }

    public static boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }

    boolean equals(int value) {
        return this.value == value;
    }

    boolean equals(MyInteger myInteger) {
        return myInteger.value == value;
    }

    static int parseInt(char[] ch) {
        int sum = 0;

        for (char i : ch) {
            sum += Integer.parseInt(String.valueOf(i));
        }
        return sum;
    }

    static int parseInt(String str) {
        return Integer.parseInt(str);
    }
}

class TestMyInteger{

    public static void main(String[] args) {
        char[] ch = {'4','5','6','7'};
        MyInteger myInteger = new MyInteger(24);
        System.out.println( myInteger.equals(24));
        System.out.println(myInteger.parseInt(new char[] {'1', '5', '6'}));




    }
}

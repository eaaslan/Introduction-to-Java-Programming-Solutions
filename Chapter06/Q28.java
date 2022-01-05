package homework.chapter06;

public class Q28 {
    public static void main(String[] args) {
        System.out.println("  p      2^p –1");
        System.out.println("-----------------");
        for (int p = 2; p <= 31; p++) {
            if (isPrime(p) && isPrime((int) (Math.pow(2, p) - 1))) {
                System.out.printf("%3d",p);
                System.out.printf("%10d\n",(int) (Math.pow(2, p) - 1));
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        //if not, then just check the odds
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

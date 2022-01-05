package chapter10.Q05;

public class TestClass {

    public static void main(String[] args) {
        StackOfIntegers stackOfIntegers = new StackOfIntegers();
        int num = 120;
        int primeFact = 2;

        while (num >= primeFact) {
            if (num % primeFact == 0) {
                stackOfIntegers.push(primeFact);
                num /= primeFact;
            } else primeFact++;

        }
        while (!stackOfIntegers.empty()) {
            System.out.print(stackOfIntegers.pop() + " ");
        }



    }
}

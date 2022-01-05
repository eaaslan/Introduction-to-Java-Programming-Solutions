package homework.chapter07;

public class Q13 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(getRandom(array));
    }

    public static int getRandom(int... numbers) {
        boolean isFound;
        int randomNum = 0;
        do {
            isFound = false;
            randomNum = (int) (Math.random() * 54 + 1);
            for (int number : numbers) {
                if (number == randomNum) {
                    isFound = true;
                }
            }
        } while (isFound);

        return randomNum;
    }
}
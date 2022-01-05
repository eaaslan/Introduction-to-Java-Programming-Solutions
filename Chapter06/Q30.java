package homework.chapter06;

public class Q30 {

    public static void main(String[] args) {
        int sumOfDices = rollDice();
        if (sumOfDices == 2 || sumOfDices == 3 || sumOfDices == 12) {
            System.out.println("You lose");
        } else if (sumOfDices == 7 || sumOfDices == 11) {
            System.out.println("You win");
        } else {
            System.out.println("pont is " + sumOfDices);
            winOrLose(sumOfDices);
        }
    }

    public static int rollDice() {
        int newDiceOne = 1 + (int) (Math.random() * 6);
        int newDiceTwo = 1 + (int) (Math.random() * 6);
        int newSumOfDices = newDiceOne + newDiceTwo;
        System.out.println("You rolled " + newDiceOne + "+" + newDiceTwo + "=" + newSumOfDices);
        return newSumOfDices;
    }

    static void winOrLose(int sumOfDices) {
        while(true) {
            int newSumOfDices = rollDice();

            if (newSumOfDices == 7) {
                System.out.println("You lose");
                break;
            } else if (sumOfDices == newSumOfDices) {
                System.out.println("You win");
                break;
            }
        }
/*
        int newSumOfDices;
        do {
            newSumOfDices = rollDice();
        } while (newSumOfDices != 7 && sumOfDices != newSumOfDices);
        if (newSumOfDices == 7) {
            System.out.println("You lose");
        } else {
            System.out.println("You win");
        }

 */
    }
}

package homework.chapter06;

public class Q32 {
    public static void main(String[] args) {

        int winCounter = 0;
        int loseCounter = 0;
        for (int i = 0; i < 10000; i++) {
            int sumOfDices = rollDice();
            if (sumOfDices == 2 || sumOfDices == 3 || sumOfDices == 12) {
                loseCounter++;
            } else if (sumOfDices == 7 || sumOfDices == 11) {
                winCounter++;
            } else {
                int num = winOrLose(sumOfDices);
                if (num == 1) {
                    winCounter++;
                } else {
                    loseCounter++;
                }
            }
        }
        System.out.println("You win " + winCounter + " times");
        System.out.println("You lose " + loseCounter + " times");
    }

    public static int rollDice() {

        int newDiceOne = 1 + (int) (Math.random() * 6);
        int newDiceTwo = 1 + (int) (Math.random() * 6);
        int newSumOfDices = newDiceOne + newDiceTwo;
        return newSumOfDices;
    }

    static int winOrLose(int sumOfDices) {
        int newSumOfDices;
        int winOrLose = 0;
        do {
            newSumOfDices = rollDice();
        }
        while (!(newSumOfDices == 7 || sumOfDices == newSumOfDices));

        if (newSumOfDices == 7) {
            winOrLose = -1;
        } else {
            winOrLose = 1;
        }
        return winOrLose;
    }
}

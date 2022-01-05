package homework.chapter07;

public class Q29 {
    public static void main(String[] args) {
        int[] deck = new int[52];

        for (int i = 0; i < deck.length; i++)
            deck[i] = i;

//        for (int i = 0; i < deck.length; i++) {
//            int index = (int) (Math.random() * deck.length);
//            int temp = deck[i];
//            deck[i] = deck[index];
//            deck[index] = temp;

        int count = 0;
        int sum = 0;
        while (sum != 24) {
            sum = 0;
            for (int i = 0; i < 4; i++) {
                sum += pickCard();
            }
            count++;
        }
        System.out.println("Number of try: " + count);
    }

    private static int pickCard() {
        return ((int) (Math.random() * 52) % 13) + 1;
    }
}





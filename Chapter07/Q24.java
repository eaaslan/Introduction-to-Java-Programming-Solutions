package homework.chapter07;

public class Q24 {

    public static void main(String[] args) {

        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King"};

        // Initialize cards
        for (int i = 0; i < deck.length; i++)
            deck[i] = i;

        // Shuffle the cards
        for (int i = 0; i < deck.length; i++) {
            // Generate an index randomly
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }


        boolean isSpadesSelected = false;
        boolean isClubsSelected = false;
        boolean isHeartsSelected = false;
        boolean isDiamondsSelected = false;

        int i = 0;
        while (true) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            i++;

            switch (suit) {
                case "Spades":
                    if (isSpadesSelected)
                        continue;

                    isSpadesSelected = true;
                    break;
                case "Hearts":
                    if (isHeartsSelected)
                        continue;

                    isHeartsSelected = true;
                    break;
                case "Clubs":
                    if (isClubsSelected)
                        continue;

                    isClubsSelected = true;
                    break;
                case "Diamonds":
                    if (isDiamondsSelected)
                        continue;

                    isDiamondsSelected = true;
                    break;
            }

            System.out.println("Card number " + (deck[i] + 1) + ": " + rank + " of " + suit);

            if (isSpadesSelected && isClubsSelected && isHeartsSelected && isDiamondsSelected)
                break;
        }
        System.out.println("Number of picks: " + i);
    }
//    public static void main(String[] args) {
//        BigInteger number = new BigInteger("" + Long.MAX_VALUE);
//        while(true) {
//            number.add(BigInteger.ONE);
//            BigInteger div = new BigInteger("2");
//            boolean isPrime = true;
//            while (div.compareTo(number) < 0) {
//                div.add(BigInteger.ONE);
//                if (number.mod(div) == BigInteger.ZERO) {
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//    }
}


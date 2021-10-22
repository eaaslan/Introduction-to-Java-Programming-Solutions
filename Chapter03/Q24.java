package homework.chapter03;

public class Q24 {

    public static void main(String[] args) {

        int pick = (int) (Math.random() * 52);

        int rank = (pick % 13); // random num between 0-12
        int suit = pick / 13; // random num between 0-3

        System.out.print("The card you picked is ");
        switch (rank) {
            case 0:
                System.out.print("Ace");    break;
            case 10:
                System.out.print("Jack");   break;
            case 11:
                System.out.print("Queen");  break;
            case 12:
                System.out.print("King");   break;
            default:
                System.out.print(rank + 1); break;
        }
        System.out.print(" of");
        switch (suit) {
            case 0:
                System.out.println(" Clubs");       break;
            case 1:
                System.out.println(" Diamonds");    break;
            case 2:
                System.out.println(" Hearts");      break;
            case 3:
                System.out.println(" Spades");      break;
        }
    }
}

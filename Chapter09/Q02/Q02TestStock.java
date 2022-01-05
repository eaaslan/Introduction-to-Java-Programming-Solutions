package homework.chapter09.Q02;
import homework.chapter09.Q02.Q02Stock;

public class Q02TestStock {
    public static void main(String[] args) {
        Q02Stock stock = new Q02Stock("ORCL", "Oracle Corporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;
        System.out.println("Symbol : " + stock.symbol + " Name: " + stock.name);
        System.out.println("Price-change percentage: " + stock.getChangePercent());
    }
}

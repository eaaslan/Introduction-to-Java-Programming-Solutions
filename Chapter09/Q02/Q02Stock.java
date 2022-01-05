package homework.chapter09.Q02;
public class Q02Stock {

    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Q02Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }
    double getChangePercent() {
        return (currentPrice - previousClosingPrice) / Math.abs(previousClosingPrice) * 100;
    }
}


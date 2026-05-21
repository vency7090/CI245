package HW3VENCYPATEL;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public String getSymbol() { return symbol; }
    public String getName() { return name; }
    public double getPreviousClosingPrice() { return previousClosingPrice; }
    public double getCurrentPrice() { return currentPrice; }

    public void setPreviousClosingPrice(double newPrice) {
        this.previousClosingPrice = newPrice;
    }
    public void setCurrentPrice(double newPrice) {
        this.currentPrice = newPrice;
    }

    public double getChangePercent() {
        return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
    }

    @Override
    public String toString() {
        return "Stock[" + symbol + ", " + name + "]";
    }
}

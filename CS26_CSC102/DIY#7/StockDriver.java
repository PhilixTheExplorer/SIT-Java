import java.util.Scanner;

public class StockDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String symbol = sc.nextLine();
        String name = sc.nextLine();
        Stock s = new Stock(symbol, name);
        double previousPrice = sc.nextDouble();
        double currentPrice = sc.nextDouble();
        s.setPreviousClosingPrice(previousPrice);
        s.setCurrentPrice(currentPrice);
        System.out.println("Stock name: " + s.name);
        System.out.println("Stock symbol: " + s.symbol);
        System.out.printf("Price-change percentage: %.2f%%", s.getChangePercent());
    }
}

class Stock {
    // Write your code here
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    // Constructor - DO NOT CHANGE HERE
    Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
    }

    // Write your code here
    double getChangePercent() {
        double pc = ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
        return pc;
    }

    void setPreviousClosingPrice(double oldPrice) {
        previousClosingPrice = oldPrice;
    }

    void setCurrentPrice(double newPrice) {
        currentPrice = newPrice;
    }

}
package observerPattern;

public interface StockObserver {
    void update(double ibmPrice, double applePrice, double oraclePrice);
}

package observerPattern;

public interface StockObservable {
    void add(StockObserver observer);
    void notifyUpdate();
    void delete(StockObserver observer);
}

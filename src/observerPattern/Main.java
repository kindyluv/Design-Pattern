package observerPattern;

public class Main {
    public static void main(String[] args) {

        StockHolderObservable observable = new StockHolderObservable();

        StockHolderObserver observer1 = new StockHolderObserver(observable);

        observable.setIbmStock(587.00);
        observable.setAppleStock(980.00);
        observable.setOracleStock(689.00);

        StockHolderObserver observer2 = new StockHolderObserver(observable);

        observable.setIbmStock(673.00);
        observable.setAppleStock(375.00);
        observable.setOracleStock(936.00);



    }
}

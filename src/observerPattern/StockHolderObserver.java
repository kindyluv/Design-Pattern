package observerPattern;

public class StockHolderObserver implements StockObserver{
    private double ibmPrice;
    private double applePrice;
    private double oraclePrice;
    private StockObservable observable;
    private static int stockCounter = 0;
    private int stockTrackingId;

    public StockHolderObserver(StockObservable observable1){
        this.observable = observable1;
        this.stockTrackingId = ++stockCounter;
        System.out.println("New Observer " + this.stockTrackingId);
        observable.add(this);
    }

    @Override
    public void update(double ibmPrice, double applePrice, double oraclePrice) {
        this.ibmPrice=ibmPrice;
//        this.observable.getIbmStock();
        this.applePrice=applePrice;
        this.oraclePrice=oraclePrice;

        printThePrices();
    }

    public void printThePrices() {
        System.out.println(stockTrackingId+ "\nIBM: " + ibmPrice
                + "\nAPPLE: " + applePrice + "\nORACLE: " + oraclePrice);
    }
}

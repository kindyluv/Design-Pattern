package observerPattern;

import java.util.ArrayList;


public class StockHolderObservable implements StockObservable{
    private double ibmPrice;
    private double applePrice;
    private double oraclePrice;
    private ArrayList<StockObserver> observer;
//    private Long stock;

    public StockHolderObservable(){
        this.observer = new ArrayList<>();
    }

    @Override
    public void add(StockObserver observers) {
        observer.add(observers);
    }

    @Override
    public void notifyUpdate() {
        for (StockObserver observer_ : observer) {
            observer_.update(ibmPrice, applePrice, oraclePrice);
        }
    }

    @Override
    public void delete(StockObserver observers) {
        observer.remove(observers);
    }

    public void setIbmStock(double ibmStock){
        this.ibmPrice = ibmStock;
        System.out.println("set a new IBM Stock "+ ibmPrice);
        notifyUpdate();
    }

    public double getIbmStock() {
        return this.ibmPrice;
    }

    public void setAppleStock(double appleStock) {
        this.applePrice=appleStock;
        System.out.println("set a new APPLE Stock "+ applePrice);
        notifyUpdate();
    }

    public double getAppleStock() {
        return this.applePrice;
    }

    public void setOracleStock(double oracleStock){
        this.oraclePrice = oracleStock;
        System.out.println("set a new ORACLE Stock "+ oraclePrice);
        notifyUpdate();
    }

    public double getOracleStock() {
        return this.oraclePrice;
    }
}

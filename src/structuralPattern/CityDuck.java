package structuralPattern;

public class CityDuck extends Duck{

    @Override
    IQuackBehaviour iQuackBehaviour(IQuackBehaviour quack) {
        return quack;
    }

    @Override
    IFlyBehaviour iFlyBehaviour(IFlyBehaviour fly) {
        return fly;
    }

    @Override
    public void display(){
        super.display();
    }
}

package structuralPattern;

public class WildDuck extends Duck{

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

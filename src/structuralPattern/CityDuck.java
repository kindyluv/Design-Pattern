package structuralPattern;

public class CityDuck extends Duck{


    @Override
    IQuackBehaviour quackBehaviour(IQuackBehaviour quack) {
        quack.quack();
        return quack;
    }

    @Override
    IFlyBehaviour iFlyBehaviour(IFlyBehaviour fly) {
        fly.fly();
        return fly;
    }

    @Override
    Display display(Display display) {
        display.display();
        return display;
    }


}

package structuralPattern;

public abstract class Duck {

    abstract IQuackBehaviour quackBehaviour (IQuackBehaviour quack);
    abstract IFlyBehaviour iFlyBehaviour(IFlyBehaviour fly);

    abstract Display display(Display display);

}

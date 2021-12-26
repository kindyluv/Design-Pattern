package structuralPattern;

public abstract class Duck {

    abstract IQuackBehaviour iQuackBehaviour(IQuackBehaviour quack);
    abstract IFlyBehaviour iFlyBehaviour(IFlyBehaviour fly);

    public void display(){
        System.out.println("Duck abstract display");
    }

}

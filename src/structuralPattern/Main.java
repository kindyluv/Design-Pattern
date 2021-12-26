package structuralPattern;

public class Main {
    public static void main(String[] args) {
        Duck[] duck = {new WildDuck(), new CityDuck()};

        IQuackBehaviour[] iQuackBehaviour = {new NoQuack(), new SimpleQuack()};
        IFlyBehaviour[] iFlyBehaviour = {new SimpleFlying(), new JetFlying()};
        Display[] display = {new SimpleDisplay(), new ToyDisplay()};

        duck[0].quackBehaviour(new NoQuack());
        duck[0].quackBehaviour(new SimpleQuack());

        duck[0].display(new SimpleDisplay());
        duck[0].display(new ToyDisplay());

        duck[0].iFlyBehaviour(new JetFlying());
        duck[0].iFlyBehaviour(new SimpleFlying());

        duck[1].quackBehaviour(new NoQuack());
        duck[1].quackBehaviour(new SimpleQuack());

        duck[1].iFlyBehaviour(new JetFlying());
        duck[1].iFlyBehaviour(new SimpleFlying());

        duck[1].display(new SimpleDisplay());
        duck[1].display(new ToyDisplay());
    }
}

package structuralPattern;

public class NoQuack implements IQuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I cant Quack");
    }
}

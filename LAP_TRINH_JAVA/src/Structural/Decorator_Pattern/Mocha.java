package Structural.Decorator_Pattern;

public class Mocha extends CondimentDecorator{
    public Mocha(String description, Bevarage bevarage) {
        super(description, bevarage);
    }

    @Override
    public int cost() {
        return 5 + bevarage.cost();
    }
}

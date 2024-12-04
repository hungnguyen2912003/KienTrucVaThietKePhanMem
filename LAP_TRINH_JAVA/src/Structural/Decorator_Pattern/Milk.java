package Structural.Decorator_Pattern;

public class Milk extends CondimentDecorator{
    public Milk(String description, Bevarage bevarage) {
        super(description, bevarage);
    }

    @Override
    public int cost() {
        return 2 + bevarage.cost();
    }
}

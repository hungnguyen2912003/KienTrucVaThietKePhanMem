package Structural.Decorator_Pattern;

public class HouseBlend extends Bevarage{
    public HouseBlend(String description) {
        super(description);
    }

    @Override
    public int cost() {
        return 10;
    }
}

package Structural.Decorator_Pattern;

public abstract class CondimentDecorator extends Bevarage{
    Bevarage bevarage;

    public CondimentDecorator(String description, Bevarage bevarage) {
        super(description);
        this.bevarage = bevarage;
    }

    @Override
    public String getDescription() {
        return bevarage.getDescription() + ", " + super.getDescription();
    }
}

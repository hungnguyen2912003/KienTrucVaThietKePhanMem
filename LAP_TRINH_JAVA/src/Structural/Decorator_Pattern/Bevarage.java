package Structural.Decorator_Pattern;

public abstract class Bevarage {
    String description;
    public abstract int cost();
    public Bevarage(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

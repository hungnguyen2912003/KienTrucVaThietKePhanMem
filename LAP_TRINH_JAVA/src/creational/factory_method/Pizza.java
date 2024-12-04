package creational.factory_method;

public abstract class Pizza {

    StringBuilder builder = new StringBuilder();
    abstract void prepare();
    abstract void bake();
    abstract void box();
    abstract void cut();

    @Override
    public String toString() {
        return builder.toString();
    }
}

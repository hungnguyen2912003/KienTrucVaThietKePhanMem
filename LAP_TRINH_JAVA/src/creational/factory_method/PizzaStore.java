package creational.factory_method;

public abstract class PizzaStore {
    abstract Pizza createPizza(PizzaType type);
    Pizza order(PizzaType type){
        Pizza p = createPizza(type);
        p.prepare();
        p.bake();
        p.cut();
        p.box();
        return p;
    }
}

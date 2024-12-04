package creational.factory_method;

public class USAPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(PizzaType type) {
        switch (type){
            case PHO_MAI -> {
                return new USA_ChessePizza();
            }
        }
        return null;
    }
}

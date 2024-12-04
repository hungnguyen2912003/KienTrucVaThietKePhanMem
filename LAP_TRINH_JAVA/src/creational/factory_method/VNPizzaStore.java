package creational.factory_method;

public class VNPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(PizzaType type) {
        switch (type){
            case HAI_SAN -> {
                return new VN_HaiSanPizza();
            }
            case NAM -> {
                return new VN_NamPizza();
            }
        }
        return null;
    }
}

package creational.factory_method;

public class Main_Factory {
    public static void main(String[] args) {
        PizzaStore vnPizzaStore = new VNPizzaStore();
        Pizza p = vnPizzaStore.order(PizzaType.HAI_SAN);
        System.out.println(p.toString());


        PizzaStore usaPizzaStore = new USAPizzaStore();
        Pizza p2 = usaPizzaStore.order(PizzaType.PHO_MAI);
        System.out.println(p2.toString());
    }
}

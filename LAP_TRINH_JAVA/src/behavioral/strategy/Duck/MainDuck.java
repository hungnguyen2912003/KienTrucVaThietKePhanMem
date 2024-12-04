package behavioral.strategy.Duck;

public class MainDuck {
    public static void main(String[] args) {
        Duck duck = new VitQuay();
        duck.setFlyBehavior(new BayTrenLoThan());
        duck.setQuackBehavior(new VitQuayKeu());
        duck.display();

        Duck duck1 = new VitTroi();
        duck1.setFlyBehavior(new BayTrenTroi());
        duck1.setQuackBehavior(new VitTroiKeu());
        duck1.display();
    }
}

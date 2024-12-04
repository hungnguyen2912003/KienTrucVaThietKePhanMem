package behavioral.strategy.Duck;

public class VitTroi extends Duck{

    @Override
    public void display() {
        System.out.println("Tôi là vịt trời");
        swim();
        performFly();
        performQuack();
    }
}

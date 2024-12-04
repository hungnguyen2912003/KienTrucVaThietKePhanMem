package Structural.Decorator_Pattern;

public class Main_Bevarage {
    public static void main(String[] args) {
        Bevarage b = new HouseBlend("Cafe TN");
        b = new Milk("Sữa cô gái Hà Lan", b);
        b = new Milk("Sữa ông Thọ", b);
        b = new Mocha("Mocha Nhật bản", b);
        System.out.println(b.getDescription());
        System.out.println(b.cost());
    }
}

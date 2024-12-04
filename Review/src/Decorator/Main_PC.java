package Decorator;

public class Main_PC {
    public static void main(String[] args) {
        Computer c = new ConcreateComputer("Acer 315X", "AMD Ryzen 5500U", 8, 512, "Oled", 500, 250, 150, 300, 400);
        System.out.println(c.build());
        System.out.println("Tổng tiền: " + c.value());
        System.out.println("Lần 1");
        c = new UpgradeRAM(c, 8, 150);
        System.out.println(c.build());
        System.out.println("Tổng dung lượng ram: " + c.getRam());
        System.out.println("Tổng tiền: " + c.value());
    }
}

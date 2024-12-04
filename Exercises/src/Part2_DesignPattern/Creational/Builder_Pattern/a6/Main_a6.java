package Part2_DesignPattern.Creational.Builder_Pattern.a6;

public class Main_a6 {
    public static void main(String[] args) {

        UI1 ui1 = new UI1();
        UI2 ui2 = new UI2();
        ui1.Add(new SanPham("KC123", "Bánh kẹo", 500, 5000), "1");
        ui1.Add(new SanPham("TG214", "Bút bi", 250, 15000), "1");

        ui2.Add(new SanPham("KI203", "Bút xóa", 150, 25000), "2");
        ui2.Add(new SanPham("QS304", "Cuốn vở", 220, 35000), "2");

        ui1.InDS("2");
    }
}

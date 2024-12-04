package Part2_DesignPattern.Creational.Builder_Pattern.a1;

public class Main_a1 {
    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDon.Builder()
                .setHeader(new HoaDonHeader("001", "3/3/2024", "Hưng"))
                .addCTHD(new CTHD("Áo sơ mi", 2, 500000, 15))
                .addCTHD(new CTHD("Quần tây", 1, 300000, 5))
                .addCTHD(new CTHD("Giày Nike", 1, 1500000, 10))
                .Build();
        System.out.println(hoaDon.toString());

        HoaDon hoaDon2 = new HoaDon.Builder()
                .setHeader(new HoaDonHeader("002", "8/3/2024", "Quang"))
                .addCTHD(new CTHD("Laptop", 10, 350000000, 35))
                .addCTHD(new CTHD("Iphone 15 Pro Max", 5, 200000000, 25))
                .Build();
        System.out.println(hoaDon2.toString());
    }
}

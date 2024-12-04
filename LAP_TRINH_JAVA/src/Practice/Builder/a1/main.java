package Practice.Builder.a1;

public class main {
    public static void main(String[] args) {
        HoaDon hd1 = new HoaDon.Builder()
                .setHeader(new HoaDonHeader("123", "26/3/2024", "Hưng"))
                .addCTHD(new ChiTietHoaDon("áo", 4, 500_000, 3.7f))
                .addCTHD(new ChiTietHoaDon("quần", 6, 200_000, 1.4f))
                .addCTHD(new ChiTietHoaDon("giày", 2, 700_000, 0.5f))
                .build();
        System.out.println(hd1.inHD());
    }
}

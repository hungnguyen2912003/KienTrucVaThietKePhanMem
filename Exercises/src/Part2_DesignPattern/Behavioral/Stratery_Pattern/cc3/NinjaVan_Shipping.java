package Part2_DesignPattern.Behavioral.Stratery_Pattern.cc3;

public class NinjaVan_Shipping implements VanChuyen{
    @Override
    public int ThoiGianNhanHang() {
        return 5;
    }

    @Override
    public double PhiVanChuyen() {
        return 100000;
    }
}

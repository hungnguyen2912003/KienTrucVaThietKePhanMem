package Part2_DesignPattern.Behavioral.Stratery_Pattern.cc3;

public class GiaoHangNhanh_Shipping implements VanChuyen{

    @Override
    public int ThoiGianNhanHang() {
        return 4;
    }

    @Override
    public double PhiVanChuyen() {
        return 50000;
    }
}

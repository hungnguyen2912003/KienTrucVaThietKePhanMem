package Part2_DesignPattern.Behavioral.Stratery_Pattern.cc3;

public class Voucher implements KhuyenMai{
    double Discount_Percent;
    double Max_Discount;

    public Voucher(double discount_Percent, double max_Discount) {
        Discount_Percent = discount_Percent;
        Max_Discount = max_Discount;
    }

    @Override
    public double Voucher(double TongGia) {
        double discount = TongGia * Discount_Percent;
        return Math.min(discount, Max_Discount);
    }
}

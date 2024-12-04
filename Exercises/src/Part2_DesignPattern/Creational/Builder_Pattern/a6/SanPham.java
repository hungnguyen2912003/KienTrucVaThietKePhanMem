package Part2_DesignPattern.Creational.Builder_Pattern.a6;

public class SanPham {
    String MaSanPham;
    String TenSanPham;
    int SoLuong;
    double DonGia;
    public SanPham(String maSanPham, String tenSanPham, int soLuong, double donGia) {
        MaSanPham = maSanPham;
        TenSanPham = tenSanPham;
        SoLuong = soLuong;
        DonGia = donGia;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Mã sản phẩm: ").append(MaSanPham).append("\t")
                .append("Tên sản phẩm: ").append(TenSanPham).append("\t")
                .append("Số lượng: ").append(SoLuong).append("\t")
                .append("Đơn giá: ").append(DonGia);
        return builder.toString();
    }
}

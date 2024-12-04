package Part2_DesignPattern.Creational.Builder_Pattern.a1;

public class CTHD {
    String SanPham;
    int SoLuong;
    float DonGia;
    float ChietKhau;

    public CTHD(String sanPham, int soLuong, float donGia, float chietKhau) {
        SanPham = sanPham;
        SoLuong = soLuong;
        DonGia = donGia;
        ChietKhau = chietKhau;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Tên sản phẩm: ").append(SanPham).append("\t")
                .append("Số lượng: ").append(SoLuong).append("\t")
                .append("Đơn giá: ").append(DonGia).append("\t")
                .append("Chiết khấu: ").append(ChietKhau).append("\n");
        return builder.toString();
    }
}

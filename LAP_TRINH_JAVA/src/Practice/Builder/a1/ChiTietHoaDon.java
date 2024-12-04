package Practice.Builder.a1;

public class ChiTietHoaDon {
    public String maSP;
    public int soLuong;
    public float donGia, chietKhau;

    public ChiTietHoaDon(String maSP, int soLuong, float donGia, float chietKhau) {
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    public String inHD(){
        StringBuilder builder = new StringBuilder();

        builder.append("Mã sản phẩm: ").append(maSP).append("\t")
                .append("Số lượng: ").append(soLuong).append("\t")
                .append("Đơn giá: ").append(donGia).append("\t")
                .append("Chiết khấu: ").append(chietKhau).append("\n");

        return builder.toString();
    }
}

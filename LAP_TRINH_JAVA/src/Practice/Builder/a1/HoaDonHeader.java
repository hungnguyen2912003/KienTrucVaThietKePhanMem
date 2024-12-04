package Practice.Builder.a1;

public class HoaDonHeader {
    public String maHoaDon;
    public String ngayBan;
    public String tenKhachHang;

    public HoaDonHeader(String maHoaDon, String ngayBan, String tenKhachHang) {
        this.maHoaDon = maHoaDon;
        this.ngayBan = ngayBan;
        this.tenKhachHang = tenKhachHang;
    }

    public String inHD(){
        StringBuilder builder = new StringBuilder();

        builder.append("Mã hóa đơn: ").append(maHoaDon).append("\t")
                .append("Ngày bán: ").append(ngayBan).append("\t")
                .append("Tên khách hàng: ").append(tenKhachHang).append("\n");

        return builder.toString();
    }
}

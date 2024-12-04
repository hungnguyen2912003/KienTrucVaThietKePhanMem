package Part2_DesignPattern.Creational.Builder_Pattern.a1;

public class HoaDonHeader {
    String MaHoaDon;
    String NgayBan;
    String TenKH;

    public HoaDonHeader(String maHoaDon, String ngayBan, String tenKH) {
        MaHoaDon = maHoaDon;
        NgayBan = ngayBan;
        TenKH = tenKH;
    }
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Mã hóa đơn: ").append(MaHoaDon).append("\t")
                .append("Ngày bán: ").append(NgayBan).append("\t")
                .append("Tên khách hàng: ").append(TenKH).append("\n");
        return builder.toString();
    }
}

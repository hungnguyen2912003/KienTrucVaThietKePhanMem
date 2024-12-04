package Part1_NNLTJava.js5;

public class GiaoVien extends CaNhan {
    String monDay;
    String toBoMon;

    public GiaoVien(String hoTen, int tuoi, String diaChi, String sdt, String monDay, String toBoMon) {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    @Override
    public String HienThiTT() {
        return super.HienThiTT() + "Môn dạy: " + monDay + "\n" +
                "Tổ bộ môn: " + toBoMon + "\n";
    }
}

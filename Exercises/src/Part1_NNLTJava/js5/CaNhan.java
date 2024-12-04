package Part1_NNLTJava.js5;

public abstract class CaNhan {
    String hoTen;
    int tuoi;
    String diaChi;
    String sdt;

    public CaNhan(String hoTen, int tuoi, String diaChi, String sdt) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public String HienThiTT() {
        return "Họ tên: " + hoTen + "\n" +
                "Tuổi: " + tuoi + "\n" +
                "Địa chỉ: " + diaChi + "\n" +
                "Số điện thoại: " + sdt + "\n";
    }
}

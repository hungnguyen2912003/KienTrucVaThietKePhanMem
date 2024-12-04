package Part1_NNLTJava.js4;

public class ChuyenXe {
    String Masochuyen;
    String hoTen;
    String SoXe;
    float DoanhThu;

    public String getMasochuyen() {
        return Masochuyen;
    }

    public void setMasochuyen(String masochuyen) {
        Masochuyen = masochuyen;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoXe() {
        return SoXe;
    }

    public void setSoXe(String soXe) {
        SoXe = soXe;
    }

    public float getDoanhThu() {
        return DoanhThu;
    }

    public void setDoanhThu(float doanhThu) {
        DoanhThu = doanhThu;
    }

    public ChuyenXe(String masochuyen, String hoTen, String soXe, float doanhThu) {
        Masochuyen = masochuyen;
        this.hoTen = hoTen;
        SoXe = soXe;
        DoanhThu = doanhThu;
    }

    public String Xuat(){
        return "Mã số chuyến: " + Masochuyen + "\n" +
                "Họ tên tài xế: " + hoTen + "\n" +
                "Số xe: " + SoXe + "\n" +
                "Doanh thu: " + DoanhThu;
    }
}

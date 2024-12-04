package Part2_DesignPattern.Behavioral.Stratery_Pattern.cc3;

public class MatHang {
    String tenMatHang;
    int SoLuong;
    float DonGia;

    public String getTenMatHang() {
        return tenMatHang;
    }

    public void setTenMatHang(String tenMatHang) {
        this.tenMatHang = tenMatHang;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public float getDonGia() {
        return DonGia;
    }

    public void setDonGia(float donGia) {
        DonGia = donGia;
    }

    public MatHang(String tenMatHang, int soLuong, float donGia) {
        this.tenMatHang = tenMatHang;
        SoLuong = soLuong;
        DonGia = donGia;
    }


}

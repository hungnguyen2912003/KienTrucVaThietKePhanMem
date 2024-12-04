package Part2_DesignPattern.Behavioral.Stratery_Pattern.cc2;

import java.util.Date;

public class SinhVien {
    String hoTen;
    String ngaySinh;
    float diemTB;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public SinhVien(String hoTen, String ngaySinh, float diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "Họ tên: " + hoTen + "\n" +
                "Ngày sinh: " + ngaySinh + "\n" +
                "Điểm TB: " + diemTB + "\n";
    }
}

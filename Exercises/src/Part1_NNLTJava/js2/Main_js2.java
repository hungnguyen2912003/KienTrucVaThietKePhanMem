package Part1_NNLTJava.js2;

import Part1_NNLTJava.js1.NhanVien;

public class Main_js2 {
    public static void main(String[] args) {
        IQuanLy ql = new QuanLyNhanVien();
        ql.them(new NhanVien("Hưng", 20, "Nha Trang", 5_000_000, 160));
        ql.them(new NhanVien("Minh", 30, "Hà Nội", 16_000_000, 250));
        ql.them(new NhanVien("Ngân", 25, "TP Hồ Chí Minh", 2_500_000, 80));
        ql.them(new NhanVien("Thuỷ", 28, "Đà Nẵng", 15_000_000, 120));
        ql.them(new NhanVien("Tiến", 35, "Hải Phòng", 18_000_000, 300));
        ql.inDS();
    }
}

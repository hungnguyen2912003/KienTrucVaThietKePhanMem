package Part1_NNLTJava.js4;

public class Main_js4 {
    public static void main(String[] args) {
        QuanLyChuyenXe qlcx = new QuanLyChuyenXe();

        qlcx.Them(new XeNoiThanh("NT01","Hưng","79A8380", 100000, 4, 70));
        qlcx.Them(new XeNoiThanh("NT02","Minh","79A5420", 200000, 3, 40));
        qlcx.Them(new XeNoiThanh("NT03","Tùng","79A6111", 300000, 1, 50));

        qlcx.Them(new XeNgoaiThanh("SG01", "Vân", "79A1111", 950000, "Đà Nẵng", 4));
        qlcx.Them(new XeNgoaiThanh("DN05", "Lâm", "79A9809", 500000, "", 3));
        qlcx.Them(new XeNgoaiThanh("HN02", "Quỳnh", "86A3835", 400000, "Đà Nẵng", 2));

        qlcx.Xuat();

        System.out.println("Tổng doanh thu của xe nội thành: " + qlcx.DoanhThuNoiThanh());
        System.out.println("Tổng doanh thu của xe ngoại thành: " + qlcx.DoanhThuNgoaiThanh());
        System.out.println("Tổng doanh thu của cả 2 loại xe: " + qlcx.TongDoanhThu());
    }
}

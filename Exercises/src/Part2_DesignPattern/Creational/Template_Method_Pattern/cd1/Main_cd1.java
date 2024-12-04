package Part2_DesignPattern.Creational.Template_Method_Pattern.cd1;

public class Main_cd1 {
    public static void main(String[] args) {
        HoaDon hdkc = new KH_KimCuong();
        hdkc.addMH(new MatHang("Áo sơ mi", 2, 500000.0));
        hdkc.addMH(new MatHang("Quần tây đen", 3, 200000.0));
        hdkc.addMH(new MatHang("Giày Gucci", 1, 15000000.0));
        hdkc.HienThiGioHang();
    }
}

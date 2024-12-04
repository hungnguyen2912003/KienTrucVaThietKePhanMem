package Part1_NNLTJava.js3;

public class Mainjs3 {
    public static void main(String[] args) {
        SinhVienPoly sv1 = new SinhVienIT("Hưng", "Công nghệ thông tin", 8.7, 8.9, 8.5);
        SinhVienPoly sv2 = new SinhVienBiz("Minh", "Marketing", 8.4, 7.5);
        SinhVienPoly sv3 = new SinhVienPoly("Tâm", "Kế toán") {
            @Override
            double getDiem() {
                return 7.5;
            }
        };
        sv1.Xuat();
        sv2.Xuat();
        sv3.Xuat();
    }
}

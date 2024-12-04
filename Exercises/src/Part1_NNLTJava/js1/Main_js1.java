package Part1_NNLTJava.js1;

public class Main_js1 {

    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Hưng", 20, "Nha Trang", 5_000_000, 160);
        System.out.println("---Thông tin nhân viên 1---\n" + nv1.ToString());
        NhanVien nv2 = new NhanVien("Minh", 33, "TP Hồ Chí Minh", 20_000_000, 250);
        System.out.println("---Thông tin nhân viên 2---\n" + nv2.ToString());
    }
}
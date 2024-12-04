package Part1_NNLTJava.js5;

import java.util.Scanner;

public class Main_js5 {
    public static void main(String[] args) {
        LopHoc lp = new LopHoc();
        HocSinh hs1 = new HocSinh("Nguyễn Hưng", 21,"Nha Trang", "0898386715","63CNTT2","Game");
        HocSinh hs2 = new HocSinh("Đặng Hiệp", 56,"Bình Định", "0972333603","56KT","Nấu ăn");
        HocSinh hs3 = new HocSinh("Phạm Minh", 35,"TP Hồ Chí Minh", "0754223684","60NNA","Nghe nhạc");

        GiaoVien gv1 = new GiaoVien("Khắc Tâm", 58, "Hà Nội", "0905452234", "Lập trình hướng đối tượng", "Công nghệ thông tin");
        GiaoVien gv2 = new GiaoVien("Đặng Vân", 45, "Hải Phòng", "0905452222", "Kỹ thuật lập trình", "Công nghệ thông tin");
        GiaoVien gv3 = new GiaoVien("Lệ Quyên", 50, "Đà Nẵng", "0905452231", "Cơ sở dữ liệu", "Công nghệ thông tin");

        lp.themHocSinh(hs1);
        lp.themHocSinh(hs2);
        lp.themHocSinh(hs3);
        lp.themGVGD(gv1);
        lp.themGVGD(gv2);
        lp.themGVGD(gv3);

        System.out.println("Danh sách học sinh");
        lp.inDSHS();
        System.out.println("Danh sách giáo viên");
        lp.inDSGVGD();
    }
}

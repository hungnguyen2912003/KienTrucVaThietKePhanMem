package Part2_DesignPattern.Structural.Composite_Pattern.b4;

public class main_b4 {
    public static void main(String[] args) {
        KeHoachHocTap year1 = new KeHoachChung("Năm 1");

        KeHoachHocTap hk1 = new KeHoachChung("Học kỳ 1");

        KeHoachHocTap monhoc1 = new MonHoc("Công nghệ phần mềm", 3, 450_000);
        KeHoachHocTap monhoc2 = new MonHoc("Kiểm thử phần mềm", 3, 450_000);
        KeHoachHocTap monhoc3 = new MonHoc("Lập trình thiết bị di động", 3, 450_000);
        KeHoachHocTap monhoc4 = new MonHoc("Kiến trúc và thiết kế phần mềm", 3, 450_000);

        year1.add(hk1);
        hk1.add(monhoc1);
        hk1.add(monhoc2);
        hk1.add(monhoc3);
        hk1.add(monhoc4);

        KeHoachHocTap hk2 = new KeHoachChung("Học kỳ 2");

        KeHoachHocTap monhoc5 = new MonHoc("Giáo dục thể chất", 1, 280_000);
        KeHoachHocTap monhoc6 = new MonHoc("Tư tưởng Hồ Chí Minh", 2, 280_000);
        KeHoachHocTap monhoc7 = new MonHoc("Chủ nghĩa xã hội khoa học", 2, 220_000);
        KeHoachHocTap monhoc8 = new MonHoc("Kỹ thuật lập trình", 3, 370_000);

        year1.add(hk2);
        hk2.add(monhoc5);
        hk2.add(monhoc6);
        hk2.add(monhoc7);
        hk2.add(monhoc8);

        System.out.println(year1.thongTin());
    }
}

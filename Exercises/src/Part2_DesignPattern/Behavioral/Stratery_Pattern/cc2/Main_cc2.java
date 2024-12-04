package Part2_DesignPattern.Behavioral.Stratery_Pattern.cc2;

public class Main_cc2 {
    public static void main(String[] args) {
        QLSV qlsv = new QLSV();
        qlsv.Them(new SinhVien("Hưng Nguyễn", "29/01/2003", 8.3f));
        qlsv.Them(new SinhVien("Khoa Trịnh", "14/06/2003", 8.2f));
        qlsv.Them(new SinhVien("Hiệp Đinh", "23/02/2003", 8.4f));
        qlsv.Them(new SinhVien("Đạt Trần", "15/12/2003", 8.1f));

        System.out.println("In danh sách sinh viên theo điểm");
        qlsv.setSoSanh(new SoSanhTheoDiem()).sapXep2();
        qlsv.inDS();
        System.out.println("In danh sách sinh viên theo tên");
        qlsv.setSoSanh(new SoSanhTheoTen()).sapXep2();
        qlsv.inDS();
    }
}

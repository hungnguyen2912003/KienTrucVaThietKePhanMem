package ChainOfResponsibility.CB5;

public class Main_CB5 {
    public static void main(String[] args) {
        XepLoai xl1 = new XepLoaiThongThuong("Xuất xắc", 9);
        XepLoai xl2 = new XepLoaiThongThuong("Giỏi", 8);
        XepLoai xl3 = new XepLoaiThongThuong("Khá", 7);
        XepLoai xl4 = new XepLoaiThongThuong("Trung bình", 5);
        XepLoai xl5 = new XeploaiThapNhat("Yếu", 0);

        xl1.XepLoaiKeTiep(xl2);
        xl2.XepLoaiKeTiep(xl3);
        xl3.XepLoaiKeTiep(xl4);
        xl4.XepLoaiKeTiep(xl5);

        System.out.println("Xếp loại: " + xl1.xuLyXepLoai(9.3f));
    }
}

package behavioral.ChainOfResponsibility.f88;

public class Main_F88 {
    public static void main(String[] args) {
        ChoVayF88 baoVe = new Nhanvien("Hưng", "Bảo vệ", 1_000_000);
        ChoVayF88 tapVu = new Nhanvien("Minh", "Tạp vụ", 2_000_000);
        ChoVayF88 nvVP = new Nhanvien("Thiện", "Nhân viên văn phòng", 5_000_000);
        ChoVayF88 truongPhong = new Nhanvien("Khoa", "Truởng phòng", 10_000_000);
        ChoVayF88 giamDoc = new Nhanvien("Tuấn", "Giám đốc", 20_000_000);
        ChoVayF88 chuTich = new Chutich("Thủy", "Chú tịch", 50_000_000);

        baoVe.capCaoHon(tapVu)
                .capCaoHon(nvVP)
                .capCaoHon(truongPhong)
                .capCaoHon(giamDoc)
                .capCaoHon(chuTich);

        System.out.println(baoVe.xuLyVay(45_000_000));

        System.out.println(baoVe.xuLyVay(7_000_000));

        System.out.println(baoVe.xuLyVay(1_500_000));

        System.out.println(baoVe.xuLyVay(100_000_000));
    }
}

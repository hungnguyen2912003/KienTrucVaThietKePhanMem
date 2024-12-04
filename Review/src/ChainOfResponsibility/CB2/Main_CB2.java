package ChainOfResponsibility.CB2;

public class Main_CB2 {
    public static void main(String[] args) {
        ChoVay cv1 = new ChucVuThongThuong("Hưng", "Phó trưởng phòng", "Vay 500", 500000);
        ChoVay cv2 = new ChucVuThongThuong("Phú", "Trưởng phòng", "Vay 1000", 1000000);
        ChoVay cv3 = new ChucVuThongThuong("Nga", "Giám đốc", "Vay 1500", 1500000);
        ChoVay cv4 = new ChucVuCaoNhat("Hạnh", "Chủ tịch", "Vay 2000", 2000000);

        cv1.khoanVayKeTiep(cv2)
                .khoanVayKeTiep(cv3)
                .khoanVayKeTiep(cv4);

        cv1.vayTien(800000);
    }
}

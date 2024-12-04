package ChainOfResponsibility.CB3;

public class Main_CB3 {
    public static void main(String[] args) {
        TienDienSinhHoat bac1 = new BacThongThuong("Bậc 1", 0, 50, 1806);
        TienDienSinhHoat bac2 = new BacThongThuong("Bậc 2", 51, 100, 1866);
        TienDienSinhHoat bac3 = new BacThongThuong("Bậc 3", 101, 200, 2167);
        TienDienSinhHoat bac4 = new BacThongThuong("Bậc 4", 201, 300, 2729);
        TienDienSinhHoat bac5 = new BacThongThuong("Bậc 5", 301, 400, 3050);
        TienDienSinhHoat bac6 = new BacCaoNhat("Bậc 6", 401, 500, 3151);

        bac1.BacKeTiep(bac2)
                .BacKeTiep(bac3)
                .BacKeTiep(bac4)
                .BacKeTiep(bac5)
                .BacKeTiep(bac6);

        System.out.println("Bạn cần phải trả số tiền là: " + bac1.xuLyTien(250) + " VND");

    }
}

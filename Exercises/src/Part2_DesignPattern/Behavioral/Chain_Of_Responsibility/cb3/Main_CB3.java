package Part2_DesignPattern.Behavioral.Chain_Of_Responsibility.cb3;

public class Main_CB3 {
    public static void main(String[] args) {
        TienDienBacThang bac1 = new BacThongThuong("Bac 1", 0, 50, 1806);
        TienDienBacThang bac2 = new BacThongThuong("Bac 2", 50, 100, 1866);
        TienDienBacThang bac3 = new BacThongThuong("Bac 3", 100, 200, 2167);
        TienDienBacThang bac4 = new BacThongThuong("Bac 4", 200, 300, 2729);
        TienDienBacThang bac5 = new BacThongThuong("Bac 5", 300, 400, 3050);
        TienDienBacThang bac6 = new BacCaoNhat("Bac 6", 400, Integer.MAX_VALUE, 3151);

        bac1.TienDienKeTiep(bac2);
        bac2.TienDienKeTiep(bac3);
        bac3.TienDienKeTiep(bac4);
        bac4.TienDienKeTiep(bac5);
        bac5.TienDienKeTiep(bac6);
        System.out.println("Số tiền điện phải trả: " + bac1.XuLy(200) + " VND");
    }
}

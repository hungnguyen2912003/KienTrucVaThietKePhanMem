package Part2_DesignPattern.Behavioral.Chain_Of_Responsibility.cb3;

public class BacThongThuong extends TienDienBacThang{
    TienDienBacThang tieptheo;
    public BacThongThuong(String tenBac, int min, int max, int gia) {
        super(tenBac, min, max, gia);
    }

    @Override
    TienDienBacThang TienDienKeTiep(TienDienBacThang ketiep) {
        tieptheo = ketiep;
        return tieptheo;
    }

    @Override
    int XuLy(int soKW) {
        if (soKW <= max) {
            return (soKW - min) * gia;
        } else {
            return (max - min) * gia + tieptheo.XuLy(soKW);
        }
    }
}

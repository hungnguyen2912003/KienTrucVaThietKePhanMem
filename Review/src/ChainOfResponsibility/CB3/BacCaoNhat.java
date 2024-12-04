package ChainOfResponsibility.CB3;

public class BacCaoNhat extends TienDienSinhHoat{

    public BacCaoNhat(String tenBac, int min, int max, int gia) {
        super(tenBac, min, max, gia);
    }

    @Override
    TienDienSinhHoat BacKeTiep(TienDienSinhHoat keTiep) {
        return null;
    }

    @Override
    int xuLyTien(int sokwh) {
        return (sokwh - min) * gia;
    }
}

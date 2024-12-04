package ChainOfResponsibility.CB3;

public class BacThongThuong extends TienDienSinhHoat{

    TienDienSinhHoat keTiep;

    public BacThongThuong(String tenBac, int min, int max, int gia) {
        super(tenBac, min, max, gia);
    }

    @Override
    TienDienSinhHoat BacKeTiep(TienDienSinhHoat keTiep) {
        this.keTiep = keTiep;
        return keTiep;
    }

    @Override
    int xuLyTien(int sokwh) {
        if(sokwh < max)
        {
            return (sokwh - min) * gia;
        }
        else{
            return (max - min) * gia * keTiep.xuLyTien(sokwh);
        }
    }
}

package ChainOfResponsibility.CB3;

public abstract class TienDienSinhHoat {

    public String tenBac;

    int min, max, gia;

    public TienDienSinhHoat(String tenBac, int min, int max, int gia) {
        this.tenBac = tenBac;
        this.min = min;
        this.max = max;
        this.gia = gia;
    }

    abstract TienDienSinhHoat BacKeTiep(TienDienSinhHoat keTiep);

    abstract int xuLyTien(int sokwh);
}

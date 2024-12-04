package Part2_DesignPattern.Behavioral.Chain_Of_Responsibility.cb3;

public abstract class TienDienBacThang {
    String tenBac;
    int min, max;
    int gia;

    public TienDienBacThang(String tenBac, int min, int max, int gia) {
        this.tenBac = tenBac;
        this.min = min;
        this.max = max;
        this.gia = gia;
    }

    abstract TienDienBacThang TienDienKeTiep(TienDienBacThang ketiep);
    abstract  int XuLy(int soKW);
}

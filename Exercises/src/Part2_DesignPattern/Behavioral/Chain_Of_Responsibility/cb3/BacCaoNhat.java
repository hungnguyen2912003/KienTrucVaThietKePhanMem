package Part2_DesignPattern.Behavioral.Chain_Of_Responsibility.cb3;

public class BacCaoNhat extends TienDienBacThang{
    public BacCaoNhat(String tenBac, int min, int max, int gia) {
        super(tenBac, min, max, gia);
    }

    @Override
    TienDienBacThang TienDienKeTiep(TienDienBacThang ketiep) {
        return null;
    }

    @Override
    int XuLy(int soKW) {

        return (soKW-min)*gia;

    }
}

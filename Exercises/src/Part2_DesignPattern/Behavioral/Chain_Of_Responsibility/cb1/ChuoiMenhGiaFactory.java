package Part2_DesignPattern.Behavioral.Chain_Of_Responsibility.cb1;

public abstract class ChuoiMenhGiaFactory{

    protected abstract ATM getChuoiMenhGia(int menhGia);

    public void rutTien(int soTien, int menhGiaCaoNhat){
        ATM chuoiMenhGia = getChuoiMenhGia(menhGiaCaoNhat);
        chuoiMenhGia.rutTien(soTien);
    }
}

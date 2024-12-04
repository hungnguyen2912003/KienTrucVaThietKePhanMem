package ChainOfResponsibility.CB1;

public abstract class ATMFactory {
    public abstract ATM getChuoiMenhGia(int menhGia);

    public void rutTien(int soTien, int menhGiaCaoNhat){
        ATM chuoiMenhGia = getChuoiMenhGia(menhGiaCaoNhat);
        chuoiMenhGia.rutTien(soTien);
    }
}

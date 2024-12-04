package ChainOfResponsibility.CB1;

public abstract class ATM {
    int menhGia;

    public ATM(int menhGia) {
        this.menhGia = menhGia;
    }

    public abstract ATM menhGiaKeTiep(ATM keTiep);

    abstract void rutTien(int soTien);
}

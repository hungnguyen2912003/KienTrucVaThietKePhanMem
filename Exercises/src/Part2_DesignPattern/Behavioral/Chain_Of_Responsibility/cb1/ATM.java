package Part2_DesignPattern.Behavioral.Chain_Of_Responsibility.cb1;

public abstract class ATM {
    int menhGia;

    public ATM(int menhGia) {
        this.menhGia = menhGia;
    }

    abstract ATM thietlapMenhGiaThapHon(ATM atm);

    abstract void rutTien(int soTien);
}

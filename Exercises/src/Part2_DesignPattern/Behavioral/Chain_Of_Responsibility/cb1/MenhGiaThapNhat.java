package Part2_DesignPattern.Behavioral.Chain_Of_Responsibility.cb1;

public class MenhGiaThapNhat extends ATM{
    public MenhGiaThapNhat(int menhGia) {
        super(menhGia);
    }

    @Override
    ATM thietlapMenhGiaThapHon(ATM atm) {
        return null;
    }

    @Override
    void rutTien(int soTien) {
        System.out.println(soTien + " tờ mệnh giá " + menhGia);
    }
}

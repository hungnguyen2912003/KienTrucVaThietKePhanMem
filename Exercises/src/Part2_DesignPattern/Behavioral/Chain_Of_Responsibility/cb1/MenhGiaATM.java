package Part2_DesignPattern.Behavioral.Chain_Of_Responsibility.cb1;

public class MenhGiaATM extends ATM{

    ATM menhGiaThapHon;

    public MenhGiaATM(int menhGia) {
        super(menhGia);
    }

    @Override
    ATM thietlapMenhGiaThapHon(ATM atm) {
        menhGiaThapHon = atm;
        return atm;
    }

    @Override
    void rutTien(int soTien) {
        int soTo = soTien / menhGia;
        soTien = soTien % menhGia;
        System.out.println(soTo + " tờ mệnh giá " + menhGia);
        if(soTien > 0) menhGiaThapHon.rutTien(soTien);
    }
}

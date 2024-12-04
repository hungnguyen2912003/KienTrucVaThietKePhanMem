package Part2_DesignPattern.Behavioral.Chain_Of_Responsibility.cb1;

public class ChuoiMenhGiaVND extends ChuoiMenhGiaFactory{
    ATM m500 , m100, m50, m10, m1;

    public ChuoiMenhGiaVND(){
        m500 = new MenhGiaATM(500);
        m100 = new MenhGiaATM(100);
        m50 = new MenhGiaATM(50);
        m10 = new MenhGiaATM(10);
        m1 = new MenhGiaATM(1);
        m500.thietlapMenhGiaThapHon(m100)
                .thietlapMenhGiaThapHon(m50)
                .thietlapMenhGiaThapHon(m10)
                .thietlapMenhGiaThapHon(m1);
    }

    @Override
    protected ATM getChuoiMenhGia(int menhGia) {
        return switch (menhGia) {
            case 500 -> m500;
            case 100 -> m100;
            case 50 -> m50;
            case 10 -> m10;
            case 1 -> m1;
            default -> null;
        };
    }
}

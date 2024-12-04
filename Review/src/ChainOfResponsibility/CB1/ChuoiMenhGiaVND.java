package ChainOfResponsibility.CB1;

public class ChuoiMenhGiaVND extends ATMFactory{

    ATM m500, m100, m50, m10, m1;

    public ChuoiMenhGiaVND() {
        m500 = new MenhGiaThongThuong(500);
        m100 = new MenhGiaThongThuong(100);
        m50 = new MenhGiaThongThuong(50);
        m10 = new MenhGiaThongThuong(10);
        m1 = new MenhGiaThapNhat(1);

        m500.menhGiaKeTiep(m100)
                .menhGiaKeTiep(m50)
                .menhGiaKeTiep(m10)
                .menhGiaKeTiep(m1);
    }


    @Override
    public ATM getChuoiMenhGia(int menhGia) {
        return switch (menhGia){
            case 500 -> m500;
            case 100 -> m100;
            case 50 -> m50;
            case 10 -> m10;
            case 1 -> m1;
            default -> null;
        };
    }
}
